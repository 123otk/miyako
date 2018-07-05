package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddressRegisterAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private static final String MALE = "男性";
	private static final String FIMALE = "女性";
	private String defaultSexValue = MALE;
	private String sex;
	private List<String> sexList = new ArrayList<String>();
	private Map<String, Object> session;

	public String execute() {
		sexList.add(MALE);
		sexList.add(FIMALE);

		session.remove("familyNameErrorMessageList");
		session.remove("firstNameErrorMessageList");
		session.remove("familyNameKaneErrorMessageList");
		session.remove("firstNameKaneErrorMessageList");
		session.remove("emailErrorMessageList");
		session.remove("phoneNumberErrorMessageList");
		session.remove("userAddressErrorMessageList");

		return SUCCESS;



	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDefaultSexValue() {
		return defaultSexValue;
	}

	public void setDefaultSexValue(String defaultSexValue) {
		this.defaultSexValue = defaultSexValue;
	}

	public List<String> getSexList(){
		return sexList;
	}

	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
