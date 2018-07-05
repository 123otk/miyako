package com.internousdev.miyako.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dao.PurchaseHistoryInfoDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
	/*private PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();*/

	private Map<String, Object> session;


	public String execute() throws SQLException  {

		//商品購入情報をsessionへ格納
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();
		purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("loginId")));
		Iterator<PurchaseHistoryInfoDTO> iterator = purchaseHistoryInfoDTOList.iterator();
		if(!(iterator.hasNext())) {
			purchaseHistoryInfoDTOList = null;
		}
		session.put("purchaseHistoryInfoDTOList", purchaseHistoryInfoDTOList);

		//カテゴリー情報をsessionへ格納
		if(!session.containsKey("categoryList")) {
			CategoryDAO categoryDao = new CategoryDAO();
			categoryDtoList = categoryDao.getCategoryList();
			session.put("categoryDtoList", categoryDtoList);
		}

		return SUCCESS;
	}

	public List<CategoryDTO> getCategoryDtoList() {
		return categoryDtoList;
	}


	public void setmCategoryDtoList(List<CategoryDTO> mCategoryDtoList) {
		this.categoryDtoList = mCategoryDtoList;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
