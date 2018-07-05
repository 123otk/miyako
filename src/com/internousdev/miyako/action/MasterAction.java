package com.internousdev.miyako.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.MasterDAO;
import com.internousdev.miyako.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private int productStock;  //master.jspから取得
	int stock; //master.jspから取得
	private int totalProductStock;
	private int productId; //master.jspから取得

	public ArrayList<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	public MasterDAO mdao = new MasterDAO();

	public String execute() throws SQLException {

		String result = ERROR;
		//admin	が保持してれば以下の処理を実行
		if (!session.containsKey("admin")) {
			return result;
		}



		//すべての商品情報を取得する。
		productInfoDtoList = mdao.getProductInfo();

		//追加したい個数が0より大きければ、在庫数に足す。
		if (stock > 0) {
			totalProductStock += stock + productStock;
		}

		//updateStockメソッドを実行
		int count =  mdao.updateStock(totalProductStock, productId);

		//更新した個数が0より大きい、かつ在庫数よりtotalProductStockが大きければ再度全ての商品情報を取得する。
		if(count > 0){

			if (totalProductStock > productStock) {
				productInfoDtoList = mdao.getProductInfo();

				result=SUCCESS;
			}else{
				result = ERROR;

			}
		}

		return result;
	}



	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getTotalProductStock() {
		return totalProductStock;
	}

	public void setTotalProductStock(int totalProductStock) {
		this.totalProductStock = totalProductStock;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public ArrayList<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDtoList;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setProductInfoDTOList(ArrayList<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}

}
