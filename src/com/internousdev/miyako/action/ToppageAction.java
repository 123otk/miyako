package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ToppageAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
	public String execute(){


		if(!session.containsKey("categoryList")) {
			CategoryDAO categoryDao = new CategoryDAO();
			categoryDtoList = categoryDao.getCategoryList();
			session.put("categoryDtoList", categoryDtoList);
		}
			return SUCCESS;
		}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

