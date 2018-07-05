package com.internousdev.miyako.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CartInfoDAO;
import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dao.DestinationInfoDAO;
import com.internousdev.miyako.dao.UserInfoDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.dto.DestinationInfoDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;
import com.internousdev.miyako.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware{


//	変数を定義
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private String loginId;
	private String password;
	private Map<String, Object> session;

	private String categoryId;
	private boolean savedLoginId;

	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();

    private ArrayList<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();




	UserInfoDAO userInfoDAO = new UserInfoDAO();


//  	 実行ファイル
	public String execute() throws SQLException{
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count1 = userInfoDAO.createUser(familyName, firstName, familyNameKana, firstNameKana, sex, email, loginId, password);
		//ユーザ登録が１件以上ある場合にSQLを実行する。
		if (count1 > 0) {
			if(!session.containsKey("categoryList")) {
	    		CategoryDAO categoryDao = new CategoryDAO();
	    		categoryDtoList = categoryDao.getCategoryList();
	    		session.put("categoryDtoList", categoryDtoList);
	    	}
		//ユーザ登録登録後に作成したIDとPWでログインをする
	    	UserInfoDAO userInfoDao = new UserInfoDAO();
	    	if(userInfoDao.isExistsUserInfo(loginId, password)) {
	    		if(userInfoDao.login(loginId, password) > 0) {
	    			UserInfoDTO userInfoDTO = userInfoDao.getUserInfo(loginId, password);
	    			session.put("loginId", userInfoDTO.getUserId());
	    			int count=0;
	    			CartInfoDAO cartInfoDao = new CartInfoDAO();

	    			count = cartInfoDao.linkToLoginId(String.valueOf(session.get("tempUserId")),loginId);
	    			if(count > 0) {
	    				DestinationInfoDAO destinationInfoDao = new DestinationInfoDAO();
	    				try {
	    					List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();
	    					destinationInfoDtoList = destinationInfoDao.getDestinationInfo(loginId);
	    					Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
	    					if(!(iterator.hasNext())){
	    						destinationInfoDtoList = null;
	    					}
	    					session.put("destinationInfoDtoList", destinationInfoDtoList);
	    				} catch (SQLException e) {
	    					e.printStackTrace();
	    				}
	    				result = "settlement";
	    			}else {
	    				result = SUCCESS;
	    			}
	    		}
	    		    session.put("logined", 1);
	    	}
			result = SUCCESS;
		}



		return result;

	}



	public String getFamilyName() {
		return familyName;
	}



	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getFamilyNameKana() {
		return familyNameKana;
	}



	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}



	public String getFirstNameKana() {
		return firstNameKana;
	}



	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLoginId() {
		return loginId;
	}



	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}



	public boolean isSavedLoginId() {
		return savedLoginId;
	}



	public void setSavedLoginId(boolean savedLoginId) {
		this.savedLoginId = savedLoginId;
	}



	public List<CategoryDTO> getCategoryDtoList() {
		return categoryDtoList;
	}



	public void setCategoryDtoList(List<CategoryDTO> categoryDtoList) {
		this.categoryDtoList = categoryDtoList;
	}



	public ArrayList<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}



	public void setProductInfoDtoList(ArrayList<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}