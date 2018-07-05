package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.DestinationInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiCompleteAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private List<String> sexList = new ArrayList<String>();
	private String address;
	private String phoneNumber;
	private String email;
	private Map<String, Object> session;

	DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
	public String execute(){
		String result = ERROR;
		int count = destinationInfoDAO.insert(session.get("loginId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				session.get("email").toString(),
				session.get("phoneNumber").toString(),
				session.get("address").toString());
		if(count > 0){
			result = SUCCESS;
		}

		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("email");
		session.remove("phoneNumber");
		session.remove("address");

	return result;

	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public List<String> getSexList(){
		return sexList;
	}

	public void setSexList(List<String> sexList){
		this.sexList = sexList;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public Map<String, Object> session(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
