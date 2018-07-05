package com.internousdev.miyako.action;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.DestinationInfoDAO;
import com.internousdev.miyako.dao.UserInfoDAO;
import com.internousdev.miyako.dto.DestinationInfoDTO;
import com.internousdev.miyako.dto.PurchaseHistoryInfoDTO;
import com.internousdev.miyako.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	private String productId;
	private Collection<String> checkList;
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private String price;
	private String releaseCompany;
	private String productCount;
	private String subtotal;
	private String releaseDate;
	private Map<String, Object> session;

	public String execute() {
		session.remove("errorMessageForDestination");
		session.remove("purchaseHistoryInsertDTOList");
		session.remove("LoginpasswordErrorMessage");
		session.remove("userAddress");


		if(productId != null){
			session.put("productId",productId);
		}

		if(checkList != null){
			session.put("checkList",checkList);
		}
		if(productName != null){
			session.put("productName",productName);
		}
		if(productNameKana != null){
			session.put("productNameKana",productNameKana);
		}

		if(imageFilePath != null){
			session.put("imageFilePath",imageFilePath);
		}

		if(imageFileName != null){
			session.put("imageFileName",imageFileName);
		}

		if(price != null){
			session.put("price",price);
		}

		if(releaseCompany != null){
			session.put("releaseCompany",releaseCompany);
		}

		if(productCount != null){
			session.put("productCount",productCount);
		}

		if(subtotal != null){
			session.put("subtotal",subtotal);
		}

		if(releaseDate != null){
			session.put("releaseDate",releaseDate);
		}

		String result = ERROR;
		UserInfoDAO userInfoDao = new UserInfoDAO();
		int logined = userInfoDao.isLogined(String.valueOf(session.get("loginId")));
//		if (!(session.containsKey("loginId"))) {
//			session.put("payFlg", 1);
//			result = ERROR;

		if(!(logined == 1)){
			session.put("payFlg",1);
			return ERROR;
		}else{

		if (session.containsKey("loginId")) {
			DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
			List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<>();
			try {
				destinationInfoDtoList = destinationInfoDAO.getDestinationInfo(String.valueOf(session.get("loginId")));
				Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
				if (!(iterator.hasNext())) {
					destinationInfoDtoList = null;
				}
				session.put("destinationInfoDtoList", destinationInfoDtoList);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (!(session.containsKey("purchaseHistoryInsertDTOList"))) {
		List<PurchaseHistoryInfoDTO> purchaseHistoryInsertDTOList = new ArrayList<PurchaseHistoryInfoDTO>();

		CommonUtility commonUtility = new CommonUtility();

			/*String[] productIdList = commonUtility.parseArrayList(productId);
			String[] productNameList = commonUtility.parseArrayList(productName);
			String[] productNameKanaList = commonUtility.parseArrayList(productNameKana);
			String[] imageFilePathList = commonUtility.parseArrayList(imageFilePath);
			String[] imageFileNameList = commonUtility.parseArrayList(imageFileName);
			String[] priceList = commonUtility.parseArrayList(price);
			String[] releaseCompanyList = commonUtility.parseArrayList(releaseCompany);
			String[] productCountList = commonUtility.parseArrayList(productCount);
			String[] subtotalList = commonUtility.parseArrayList(subtotal);
			String[] releaseDateList = commonUtility.parseArrayList(releaseDate);*/

			String[] productIdList = commonUtility.parseArrayList(session.get("productId").toString());
			String[] productNameList = commonUtility.parseArrayList(session.get("productName").toString());
			String[] productNameKanaList = commonUtility.parseArrayList(session.get("productNameKana").toString());
			String[] imageFilePathList = commonUtility.parseArrayList(session.get("imageFilePath").toString());
			String[] imageFileNameList = commonUtility.parseArrayList(session.get("imageFileName").toString());
			String[] priceList = commonUtility.parseArrayList(session.get("price").toString());
			String[] releaseCompanyList = commonUtility.parseArrayList(session.get("releaseCompany").toString());
			String[] productCountList = commonUtility.parseArrayList(session.get("productCount").toString());
			String[] subtotalList = commonUtility.parseArrayList(session.get("subtotal").toString());
			String[] releaseDateList = commonUtility.parseArrayList(session.get("releaseDate").toString());

			for (int i = 0; i < productIdList.length; i++) {
				PurchaseHistoryInfoDTO purchaseHistoryInfoDTO = new PurchaseHistoryInfoDTO();
				purchaseHistoryInfoDTO.setUserId(String.valueOf(session.get("loginId")));
				purchaseHistoryInfoDTO.setProductId(Integer.parseInt(String.valueOf(productIdList[i])));
				purchaseHistoryInfoDTO.setProductName(String.valueOf(productNameList[i]));
				purchaseHistoryInfoDTO.setKana(String.valueOf(productNameKanaList[i]));
				purchaseHistoryInfoDTO.setImageFilePath(String.valueOf(imageFilePathList[i]));
				purchaseHistoryInfoDTO.setImageFileName(String.valueOf(imageFileNameList[i]));
				purchaseHistoryInfoDTO.setPrice(Integer.parseInt(String.valueOf(priceList[i])));
				purchaseHistoryInfoDTO.setCompanyName(String.valueOf(releaseCompanyList[i]));
				try {
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
					purchaseHistoryInfoDTO.setBuyDate(simpleDateFormat.parse(String.valueOf(releaseDateList[i])));

				} catch (ParseException e) {
					e.printStackTrace();
				}
				purchaseHistoryInfoDTO.setProductCount(Integer.parseInt(String.valueOf(productCountList[i])));
				purchaseHistoryInfoDTO.setSubtotal(Integer.parseInt(String.valueOf(subtotalList[i])));
				purchaseHistoryInsertDTOList.add(purchaseHistoryInfoDTO);
			}
			session.put("purchaseHistoryInsertDTOList", purchaseHistoryInsertDTOList);

            System.out.println(purchaseHistoryInsertDTOList);

			result = SUCCESS;
		}

//		if (!(session.containsKey("loginId"))) {
//			session.put("payFlg", 1);
//			result = ERROR;
//		} else {
//			result = SUCCESS;
//		}
        result = SUCCESS;
//        return result;
		}
		return result;
}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
}