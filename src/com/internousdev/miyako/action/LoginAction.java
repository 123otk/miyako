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
import com.internousdev.miyako.dao.MasterDAO;
import com.internousdev.miyako.dao.UserInfoDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.dto.DestinationInfoDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;
import com.internousdev.miyako.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;



public class LoginAction extends ActionSupport implements SessionAware{

    private String categoryId;
    private String loginId;
    private String password;

    private boolean checkLogin;
//    private String savedLoginId;
	private UserInfoDAO dao = new UserInfoDAO();
	private UserInfoDTO dto = new UserInfoDTO();


    private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();

	private String idErrorMessage;
	private String passwordErrorMessage;

    private Map<String, Object> session;

    private ArrayList<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();

    private String LoginpasswordErrorMessage;

    public String execute() throws SQLException {
    	String result = ERROR;

    	if(checkLogin==true) {
    		session.put("checkLogin", true);
    		System.out.println(123);
    		session.put("savedLoginId", loginId);
    		session.put("loginId", loginId);
    	}else {
    		session.put("checkLogin", false);
    		System.out.println(456);
    		session.put("loginId", loginId);

    	}

//	    if(loginId.equals("admin")&& password.equals("admin")){
//	    	MasterDAO dao = new MasterDAO();
//	    	productInfoDtoList = dao.getProductInfo();
//	    	session.put("logined", 2);
//	    	session.put("admin", true);
//	    	session.put("loginId", loginId);
//	    	return "admin";
//	    }

	    if(loginId.equals("admin")&& password.equals("admin")||
			    loginId.equals("admin2")&& password.equals("admin2")||
			    loginId.equals("admin3")&& password.equals("admin3")||
			    loginId.equals("admin4")&& password.equals("admin4")||
			    loginId.equals("admin5")&& password.equals("admin5")||
			    loginId.equals("admin6")&& password.equals("admin6")||
			    loginId.equals("admin7")&& password.equals("admin7")||
			    loginId.equals("admin8")&& password.equals("admin8")||
			    loginId.equals("admin9")&& password.equals("admin9")||
			    loginId.equals("admin10")&& password.equals("admin10")||
			    loginId.equals("admin11")&& password.equals("admin11")||
			    loginId.equals("admin12")&& password.equals("admin12")||
			    loginId.equals("admin13")&& password.equals("admin13")){
			    	MasterDAO dao = new MasterDAO();
			    	productInfoDtoList = dao.getProductInfo();
			    	session.put("logined", 2);
			    	session.put("admin", true);
			    	session.put("loginId", loginId);
			    	return "admin";
			    }




    	//ここからーーー入力内容のチェック
    			if(loginId.equals("")){ //userIdが空欄
    				idErrorMessage = ("ユーザーIDを入力してください");
    			}else if(loginId.length()>8){ //userIdの長さが1以下か8以上のとき
    				idErrorMessage = ("ユーザーIDは1文字以上8文字以下で入力してください");
    			}else if(!loginId.matches("^[a-zA-Z0-9]+$")){ //userIdに英数字以外が含まれているとき
    				idErrorMessage = ("ユーザーIDは半角英数字で入力してください");
    			}

    			if(password.equals("")){ //passwordが空欄
    				passwordErrorMessage = ("パスワードを入力してください");
    			}else if(password.length()<1 || password.length()>16){ //passwordの長さが1以下か8以上のとき
    				passwordErrorMessage = ("パスワードは1文字以上16文字以下で入力してください");
    			}else if(!password.matches("^[a-zA-Z0-9]+$")){ //passwordに英数字以外が含まれているとき
    				passwordErrorMessage = ("パスワードは半角英数字で入力してください");
    			}

    			if(idErrorMessage != null || passwordErrorMessage != null){
    				return ERROR;
    			}

    			if(!(loginId.equals(dto.getUserId()) && password.equals(dto.getPassword()))){
					LoginpasswordErrorMessage=("パスワードが違います");
					session.put("LoginpasswordErrorMessage", LoginpasswordErrorMessage);
					result = ERROR;

				}
    			//ここまで----入力チェック

    			if(idErrorMessage != null || passwordErrorMessage != null){
    				result= ERROR;
    				}else{
    					dto = dao.getUserInfo(loginId, password);
    					session.put("loginId", dto.getId());}





    	if(!session.containsKey("categoryList")) {
    		CategoryDAO categoryDao = new CategoryDAO();
    		categoryDtoList = categoryDao.getCategoryList();
    		session.put("categoryDtoList", categoryDtoList);
    	}

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
    				if(session.containsKey("payFlg")){
    					session.remove("payFlg");
    					result = "settlement";


    				}else{
    					result = SUCCESS;
    				}
    			}else {
    				result = SUCCESS;
    			}
    		}
    		    session.put("logined", 1);
    	}


 	    return result;
    }



	public String getCategoryId() {
    	return categoryId;
    }

    public void setCategoryId(String categoryId) {
    	this.categoryId = categoryId;
    }

    public String getLoginId() {
    	return loginId;
    }

    public void setLoginId(String loginId) {
    	this.loginId = loginId;
    }

    public String getPassword(){
    	return password;
    }

    public void setPassword(String password) {
    	this.password = password;
    }



	/**
	 * checkLoginを取得します。
	 * @return checkLogin
	 */
	public boolean isCheckLogin() {
	    return checkLogin;
	}



	/**
	 * checkLoginを設定します。
	 * @param checkLogin checkLogin
	 */
	public void setCheckLogin(boolean checkLogin) {
	    this.checkLogin = checkLogin;
	}



	public String getIdErrorMessage() {
		return idErrorMessage;
	}

	public void setIdErrorMessage(String idErrorMessage) {
		this.idErrorMessage = idErrorMessage;
	}

	public String getPasswordErrorMessage() {
		return passwordErrorMessage;
	}

	public void setPasswordErrorMessage(String passwordErrorMessage) {
		this.passwordErrorMessage = passwordErrorMessage;
	}

    public Map<String, Object> getSession() {
    	return session;
    }

    public void setSession(Map<String, Object> session) {
    	this.session = session;
    }

	public ArrayList<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}

	public void setProductInfoDtoList(ArrayList<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}



	/**
	 * LoginpasswordErrorMessageを取得します。
	 * @return LoginpasswordErrorMessage
	 */
	public String getLoginpasswordErrorMessage() {
	    return LoginpasswordErrorMessage;
	}



	/**
	 * LoginpasswordErrorMessageを設定します。
	 * @param LoginpasswordErrorMessage LoginpasswordErrorMessage
	 */
	public void setLoginpasswordErrorMessage(String LoginpasswordErrorMessage) {
	    this.LoginpasswordErrorMessage = LoginpasswordErrorMessage;
	}



}

