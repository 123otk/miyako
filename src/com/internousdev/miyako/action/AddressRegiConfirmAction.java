package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiConfirmAction extends ActionSupport implements SessionAware{
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private List<String> sexList = new ArrayList<String>();
	private String sex;
	private static final String MALE = "男性";
	private static final String FEMALE = "女性";
	private String defaultSexValue = MALE;
	private String address;
	private String phoneNumber;
	private String email;

	private List<String> familyNameErrorMessageList = new ArrayList<String>();
	private List<String> firstNameErrorMessageList = new ArrayList<String>();
	private List<String> familyNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> firstNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> addressErrorMessageList = new ArrayList<String>();
	private List<String> phoneNumberErrorMessageList = new ArrayList<String>();
	private List<String> emailErrorMessageList = new ArrayList<String>();

	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		InputChecker ic = new InputChecker();

		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("address", address);
		session.put("phoneNumber", phoneNumber);
		session.put("email", email);


		familyNameErrorMessageList = ic.doCheck("苗字", familyName, 1, 16, true, true, true, false, false, false, false, false);
		firstNameErrorMessageList = ic.doCheck("名前", firstName, 1, 16, true, true, true, false, false, false, false, false);
		familyNameKanaErrorMessageList = ic.doCheck("苗字(ふりがな)", familyNameKana, 1, 16, false, false, true, false, false, false, false, false);
		firstNameKanaErrorMessageList = ic.doCheck("名前(ふりがな)", firstNameKana, 1, 16, false, false, true, false, false, false, false, false);
		addressErrorMessageList = ic.doCheck("住所", address, 15, 50, true, true, false, true, true, true, false, false);
		phoneNumberErrorMessageList = ic.doCheck("電話番号", phoneNumber, 10, 13, false, false, false, true, false, false, false, false);
		emailErrorMessageList = ic.doCheck("メールアドレス", email, 18, 32, true, false, false, true, true, false, false, false);

		if(familyNameErrorMessageList.size() == 0
				&& firstNameErrorMessageList.size() == 0
				&& familyNameKanaErrorMessageList.size() == 0
				&& firstNameKanaErrorMessageList.size() == 0
				&& addressErrorMessageList.size() == 0
				&& phoneNumberErrorMessageList.size() == 0
				&& emailErrorMessageList.size() == 0){

			result = SUCCESS;

		}else{
			session.put("familyNameErrorMessageList", familyNameErrorMessageList);
			session.put("firstNameErrorMessageList", firstNameErrorMessageList);
			session.put("familyNameKanaErrorMessageList", familyNameKanaErrorMessageList);
			session.put("firstNameKanaErrorMessageList", firstNameKanaErrorMessageList);
			session.put("addressErrorMessageList", addressErrorMessageList);
			session.put("phoneNumberErrorMessageList", phoneNumberErrorMessageList);
			session.put("emailErrorMessageList", emailErrorMessageList);

			result = ERROR;

		}

		sexList.add(MALE);
		sexList.add(FEMALE);

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

	public String getFirstNameKana(){
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana){
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

	public String getDefaultSexValue(){
		return defaultSexValue;
	}

	public void setDefaultSexValue(String defaultSexValue){
		this.defaultSexValue = defaultSexValue;
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

	public List<String> getFamilyNameErrorMessageList(){
		return familyNameErrorMessageList;
	}

	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList){
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}

	public List<String> getFirstNameErrorMessageList(){
		return firstNameErrorMessageList;
	}

	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList){
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}

	public List<String> getFamilyNameKanaErrorMessageList(){
		return familyNameKanaErrorMessageList;
	}

	public void setFamilyNameKanaErrorMessageList(List<String> familyNamekanaErrorMessageList){
		this.familyNameKanaErrorMessageList = familyNamekanaErrorMessageList;
	}

	public List<String> getFirstNameKanaErrorMessageList(){
		return firstNameKanaErrorMessageList;
	}

	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList){
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}

	public List<String> getAddressErrorMessageList(){
		return addressErrorMessageList;
	}

	public void setAddressErrorMessageList(List<String> addressErrorMessageList){
		this.addressErrorMessageList = addressErrorMessageList;
	}

	public List<String> getPhoneNumberErrorMessageList(){
		return phoneNumberErrorMessageList;
	}

	public void setPhoneNumberErrorMessageList(List<String> phoneNumberErrorMessageList){
		this.phoneNumberErrorMessageList = phoneNumberErrorMessageList;
	}

	public List<String> getEmailErrorMessageList(){
		return emailErrorMessageList;
	}

	public void setEmailErrorMessageList(List<String> emailErrorMessageList){
		this.emailErrorMessageList = emailErrorMessageList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}
