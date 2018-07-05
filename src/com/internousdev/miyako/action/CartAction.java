package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CartInfoDAO;
import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dto.CartInfoDTO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

  public class CartAction extends ActionSupport implements SessionAware{
	//フィールド値を設定
	private String categoryId;
	private String keywords;
	private List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
	private Map<String,Object> session;

	//実行メソッド
      public String execute(){
        session.remove("checkListErrorMessageList");
        session.remove("productStockZeroErrorList");
        session.remove("productStockMinusErrorList");
    	//初期値設定とdao,リスト設置
    	String result = ERROR;
    	String userId = null;
    	CartInfoDAO cartInfoDao = new CartInfoDAO();
    	List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
        //ログインしているか否か
    	if(session.containsKey("loginId")){
    		userId = String.valueOf(session.get("loginId"));
    	}else if(session.containsKey("tempUserId")){
    		userId = String.valueOf(session.get("tempUserId"));
    	}
        //カートのリストを取得
    	cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
    	Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
    	if(!(iterator.hasNext())){
    		cartInfoDtoList = null;
    	}
    	session.put("cartInfoDtoList",cartInfoDtoList);
        //合計金額の計算
    	int totalPrice = Integer.parseInt(String.valueOf(cartInfoDao.getTotalPrice(userId)));
    	session.put("totalPrice",totalPrice);
    	result = SUCCESS;

    	if(!session.containsKey("categoryList")){
    		CategoryDAO categoryDao = new CategoryDAO();
    		categoryDtoList = categoryDao.getCategoryList();
    		session.put("categoryDtoList",categoryDtoList);
    	}
//    	if (!(session.containsKey("loginId"))) {
//			session.put("payFlg", 1);
//			result = ERROR;
//		} else {
//			result = SUCCESS;
//		}

    	return result;
      }

    public String getCategoryId(){
    	return categoryId;
    }

    public void setCategoryId(String categoryId){
    	this.categoryId = categoryId;
    }

    public String getKeywords() {
    	return keywords;
    }

    public void setKeywords(String keywords){
    	this.keywords = keywords;
    }

    public Map<String,Object> getSession() {
    	return session;
    }

    public void setSession(Map<String,Object> session){
    	this.session = session;
    }
}
