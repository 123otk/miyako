package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
	private String categoryId;
	private Map<String, Object> session;
	public String execute() {

		 if (!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))) {
			 CommonUtility commonUtility = new CommonUtility();
			 session.put("tempUserId", commonUtility.getRamdomValue());
		}

		if(!session.containsKey("logined")) {
			session.put("logined", 0);
		}

		if(!session.containsKey("categoryList")) {
			CategoryDAO categoryDao = new CategoryDAO();
			categoryDtoList = categoryDao.getCategoryList();
			session.put("categoryDtoList", categoryDtoList);
		}


		return SUCCESS;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<CategoryDTO> getCategoryDtoList() {
		return categoryDtoList;
	}
	public void setCategoryDtoList(List<CategoryDTO> categoryDtoList) {
		this.categoryDtoList = categoryDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}