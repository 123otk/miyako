package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends  ActionSupport implements SessionAware{
	private String categoryId;
	private List<CategoryDTO> categoryDtoList =  new ArrayList<CategoryDTO>();
	private Map<String, Object> session;
	public String execute() {
		session.remove("LoginpasswordErrorMessage");
		if(!session.containsKey("categoryList")) {
			CategoryDAO categoryDao = new CategoryDAO();
			categoryDtoList = categoryDao.getCategoryList();
			session.put("categoryDtoList", categoryDtoList);
		}
		session.put("loginIdErrorMessageList", "");
		session.put("passwordErrorMessageList", "");
		return SUCCESS;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<CategoryDTO> getcategoryDtoList() {
		return categoryDtoList;
	}

	public void setcategoryDtoList(List<CategoryDTO> categoryDtoList) {
		this.categoryDtoList = categoryDtoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
