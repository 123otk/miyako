package com.internousdev.miyako.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CartInfoDAO;
import com.internousdev.miyako.dao.ProductInfoDAO;
import com.internousdev.miyako.dao.PurchaseHistoryInfoDAO;
import com.internousdev.miyako.dto.CartInfoDTO;
import com.internousdev.miyako.dto.DestinationInfoDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;
import com.internousdev.miyako.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {

	private String id;
	private Map<String, Object> session;
	private String errorMessageForDestination;
	private List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
	private CartInfoDAO cartInfoDAO = new CartInfoDAO();
	private List<String> productStockZeroErrorList = new ArrayList<String>();
	private List<String> productStockMinusErrorList = new ArrayList<String>();

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {
		String result = ERROR;

		List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		productInfoDtoList = productInfoDAO.getProductInfoList();
		boolean soldOut = false;
		cartInfoDtoList = (ArrayList<CartInfoDTO>) session.get("cartInfoDtoList");

		if(cartInfoDtoList==null){
			result = ERROR;
			return result;
		}

		// 購入するものが在庫と照らし合わせてエラーにならないかの判別
		for (CartInfoDTO cart : cartInfoDtoList) {
			ProductInfoDTO buyProduct = null;
			for (ProductInfoDTO product : productInfoDtoList) {
				if (product.getProductId() == cart.getProductId()) {
					buyProduct = product;
				}
			}
			if (cart.getProductCount() > buyProduct.getProductStock()) {
				if (buyProduct.getProductStock() == 0) {
					productStockZeroErrorList.add("申し訳ありません。「" + buyProduct.getProductName() + "は既に在庫切れのため購入できません");
					session.put("productStockZeroErrorList", productStockZeroErrorList);
				} else {
					productStockMinusErrorList
							.add("申し訳ありません。「" + buyProduct.getProductName() + "」の現在の在庫数が" + buyProduct.getProductStock()
									+ "個のため、" + cart.getProductCount() + "個購入することはできないため、お手数ですがカートからの削除をお願いします。");
					session.put("productStockMinusErrorList", productStockMinusErrorList);
//					String s = Integer.toString(cart.getProductId());
//					cartInfoDAO.delete(s);
				}


				soldOut = true;
			} else {
				buyProduct.setProductStock(buyProduct.getProductStock() - cart.getProductCount());
			}
		}
		if (soldOut) {
			int totalPrice = Integer
					.parseInt(String.valueOf(cartInfoDAO.getTotalPrice(String.valueOf(session.get("loginId")))));
			session.put("totalPrice", totalPrice);
			return "other";
		}
		// 購入履歴への登録
		ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInsertDTOList = (ArrayList<PurchaseHistoryInfoDTO>) session
				.get("purchaseHistoryInsertDTOList");

		ArrayList<DestinationInfoDTO> destinationInfoDTOList = (ArrayList<DestinationInfoDTO>) session
				.get("destinationInfoDtoList");

		if (purchaseHistoryInsertDTOList == null) {

		} else {
			if (destinationInfoDTOList == null) {
				errorMessageForDestination = "宛先が登録されていません。宛先の登録をしてください。";
				session.put("errorMessageForDestination", errorMessageForDestination);
				result = "error2";
				return result;

			} else {
				System.out.println(purchaseHistoryInsertDTOList.size());

				PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
				int count = 0;
				for (int i = 0; i < purchaseHistoryInsertDTOList.size(); i++) {
					count += purchaseHistoryInfoDAO.regist(String.valueOf(session.get("loginId")),
							purchaseHistoryInsertDTOList.get(i).getProductId(),
							purchaseHistoryInsertDTOList.get(i).getProductCount(),
							purchaseHistoryInsertDTOList.get(i).getDestinationId(),
							purchaseHistoryInsertDTOList.get(i).getSubtotal());
				}
                System.out.println(purchaseHistoryInsertDTOList.size());
				// 購入した際にその購入個数だけ在庫を減らす
				for (CartInfoDTO cart : cartInfoDtoList) {
					cartInfoDAO.changeStockCount(cart.getProductCount(), cart.getProductId());
				}

				// 購入後のカートの中身を空にする
				if (count > 0) {
					count = cartInfoDAO.deleteAll(String.valueOf(session.get("loginId")));
					if (count > 0) {
						cartInfoDtoList = cartInfoDAO.getCartInfoDtoList(String.valueOf(session.get("loginId")));
						Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
						if (!(iterator.hasNext())) {
							cartInfoDtoList = null;
						}
						session.put("cartInfoDtoList", cartInfoDtoList);

						int totalPrice = Integer.parseInt(
								String.valueOf(cartInfoDAO.getTotalPrice(String.valueOf(session.get("loginId")))));
						session.put("totalPrice", totalPrice);
						result = SUCCESS;
					}
				}
			}

			return result;
		}
		return result;
}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessageForDestination() {
		return errorMessageForDestination;
	}

	public void setErrorMessageForDestination(String errorMessageForDestination) {
		this.errorMessageForDestination = errorMessageForDestination;
	}

}
