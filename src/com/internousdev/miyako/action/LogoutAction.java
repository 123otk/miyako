package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dao.UserInfoDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;
public class LogoutAction extends ActionSupport implements SessionAware{
	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
	private Map<String, Object> session;
	//private String savedLoginId;
	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDao = new UserInfoDAO();
		String loginId = String.valueOf(session.get("loginId"));
 //       boolean checkLogin = Boolean.valueOf(String.valueOf(session.get("checkLogin")));

		int count = userInfoDao.logout(loginId);
		if(count > 0) {

			//session.clear();
			session.remove("logined");
			session.remove("admin");
			session.remove("loginId");
			session.remove("categoryDtoList");
			session.remove("cartInfoDtoList");

//			System.out.println(loginId);
//			if(checkLogin == true){
//				session.put("savedLoginId", loginId);
//			}

			if(!session.containsKey("categoryList")) {
				CategoryDAO categoryDao = new CategoryDAO();
				categoryDtoList = categoryDao.getCategoryList();
				session.put("categoryDtoList", categoryDtoList);
			}

			result = SUCCESS;
		}
		 CommonUtility commonUtility = new CommonUtility();
		 session.put("tempUserId",commonUtility.getRamdomValue());

		System.out.println(session.get("tempUserId"));
		 return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}