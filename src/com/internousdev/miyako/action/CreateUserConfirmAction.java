package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserConfirmAction extends ActionSupport implements SessionAware{



	//	変数を定義
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private String loginId;
	private String password;
//	private static final String MALE = "男性";
//	private static final String FEMALE = "女性";

//	各変数の入力値に対してのエラーメッセージを定義
	private List<String> familyNameErrorList = new ArrayList<String>();
	private List<String> firstNameErrorList = new ArrayList<String>();
	private List<String> familyNameKanaErrorList = new ArrayList<String>();
	private List<String> firstNameKanaErrorList = new ArrayList<String>();
	private List<String> emailErrorList = new ArrayList<String>();
	private List<String> loginIdErrorList = new ArrayList<String>();
	private List<String> passwordErrorList = new ArrayList<String>();

//	セッションを定義
	private Map<String, Object> session;


//		入力値等のチェックを行う
	public String execute() {
		String result = ERROR;

		InputChecker inputChecker = new InputChecker();


//		Map型でセッションに各入力値を格納する
		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("email", email);
		session.put("loginId", loginId);
		session.put("password", password);

//		エラーリストの定義→if文でチェックするためのリスト
//		inputChecker.doCheck(propertyName, value, minLength, maxLength, availableAlphabeticCharacters, availableKanji, availableHiragana, availableHalfWidthDigit, availableHalfWidthSymbols, availableKatakana, availableFullWidthSymbols)
//		("JSP表示名", 変数名, 最小, 最大, アルファベット, 漢字, ひらがな, 数字, 半角記号,カタカナ , 全角記号);
		familyNameErrorList = inputChecker.doCheck("姓", familyName, 1, 16, true, true, true, false, false, false, false, true);
		firstNameErrorList = inputChecker.doCheck("名", firstName, 1, 16, true, true, true, false, false, false, false, true);
		familyNameKanaErrorList = inputChecker.doCheck("姓ふりがな", familyNameKana, 1, 16, false, false, true, false, false, false, false, false);
		firstNameKanaErrorList = inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false, false, false, false);
		emailErrorList = inputChecker.doCheck("メールアドレス", email, 14, 32, true, false, false, true, true, false, false, false);
		loginIdErrorList = inputChecker.doCheck("ログインID", loginId, 1, 8, true, false, false, true, false, false, false, false);
		passwordErrorList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false, false, false);

//		各入力項目が入力要件にマッチしているかを確認
		if (familyNameErrorList.size() == 0
		&& firstNameErrorList.size() == 0
		&& familyNameKanaErrorList.size() == 0
		&& firstNameKanaErrorList.size() == 0
		&& emailErrorList.size() == 0
		&& loginIdErrorList.size() == 0
		&& passwordErrorList.size() == 0){
			result = SUCCESS;
		}else {
//			入力値が要件にマッチしていない場合

			session.put("familyNameErrorList", familyNameErrorList);
			session.put("firstNameErrorList", firstNameErrorList);
			session.put("familyNameKanaErrorList", familyNameKanaErrorList);
			session.put("firstNameKanaErrorList", firstNameKanaErrorList);
			session.put("emailErrorList", emailErrorList);
			session.put("loginIdErrorList", loginIdErrorList);
			session.put("passwordErrorList", passwordErrorList);

			result = ERROR;
		}

		return result;


}


		@Override
		public void setSession(Map<String, Object> session) {
			this.session  = session;
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


		public List<String> getFamilyNameErrorList() {
			return familyNameErrorList;
		}


		public void setFamilyNameErrorList(List<String> familyNameErrorList) {
			this.familyNameErrorList = familyNameErrorList;
		}


		public List<String> getFirstNameErrorList() {
			return firstNameErrorList;
		}


		public void setFirstNameErrorList(List<String> firstNameErrorList) {
			this.firstNameErrorList = firstNameErrorList;
		}


		public List<String> getFamilyNameKanaErrorList() {
			return familyNameKanaErrorList;
		}


		public void setFamilyNameKanaErrorList(List<String> familyNameKanaErrorList) {
			this.familyNameKanaErrorList = familyNameKanaErrorList;
		}


		public List<String> getFirstNameKanaErrorList() {
			return firstNameKanaErrorList;
		}


		public void setFirstNameKanaErrorList(List<String> firstNameKanaErrorList) {
			this.firstNameKanaErrorList = firstNameKanaErrorList;
		}


		public List<String> getEmailErrorList() {
			return emailErrorList;
		}


		public void setEmailErrorList(List<String> emailErrorList) {
			this.emailErrorList = emailErrorList;
		}


		public List<String> getLoginIdErrorList() {
			return loginIdErrorList;
		}


		public void setLoginIdErrorList(List<String> loginIdErrorList) {
			this.loginIdErrorList = loginIdErrorList;
		}


		public List<String> getPasswordErrorList() {
			return passwordErrorList;
		}


		public void setPasswordErrorList(List<String> passwordErrorList) {
			this.passwordErrorList = passwordErrorList;
		}


}
