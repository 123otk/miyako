package com.internousdev.miyako.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.UserInfoDAO;
import com.internousdev.miyako.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordConfirmAction extends ActionSupport implements SessionAware {
	private String loginId;
	private String password;
	private String newPassword;
	private String confirmNewPassword;
	private String categoryId;

	private List<String> loginIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	private List<String> passwordIncorrectErrorMessageList = new ArrayList<String>();
	private List<String> newPasswordErrorMessageList = new ArrayList<String>();
	private List<String> confirmNewPasswordErrorMessageList = new ArrayList<String>();
	private List<String> newPasswordIncorrectErrorMessageList = new ArrayList<String>();

	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		session.remove("loginIdErrorMessageList");
		session.remove("passwordErrorMessageList");
		session.remove("newPasswordErrorMessageList");
		session.remove("confirmNewPasswordErrorMessageList");
		session.remove("newPasswordIncorrectErrorMessageList");
		session.remove("passwordIncorrectErrorMessageList");
		session.remove("newPasswordIncorrectErrorMessageList");
		session.remove("newPasswordIncorrectErrorMessageList");

		InputChecker inputChecker = new InputChecker();

		loginIdErrorMessageList = inputChecker.doCheck("ログインID", loginId, 1, 8, true, false, false, true, false, false,
				false, false);
		passwordErrorMessageList = inputChecker.doCheck("現在のパスワード", password, 1, 16, true, false, false, true, false,
				false, false, false);
		newPasswordErrorMessageList = inputChecker.doCheck("新しいパスワード", newPassword, 1, 16, true, false, false, true,
				false, false, false, false);
		confirmNewPasswordErrorMessageList = inputChecker.doCheck("新しいパスワード（再確認）", confirmNewPassword, 1, 16, true,
				false, false, true, false, false, false, false);
		newPasswordIncorrectErrorMessageList = inputChecker.doPasswordCheck(newPassword, confirmNewPassword);

		if (loginIdErrorMessageList.size() == 0 && passwordErrorMessageList.size() == 0
				&& newPasswordErrorMessageList.size() == 0 && confirmNewPasswordErrorMessageList.size() == 0
				&& newPasswordIncorrectErrorMessageList.size() == 0) {

			UserInfoDAO userInfoDAO = new UserInfoDAO();
			if (userInfoDAO.isExistsUserInfo(loginId, password)) {
				String concealedPassword = userInfoDAO.concealPassword(newPassword);
				session.put("loginId", loginId);
				session.put("newPassword", newPassword);
				session.put("concealedPassword", concealedPassword);
				result = SUCCESS;
			} else {
				passwordIncorrectErrorMessageList.add("入力されたパスワードが異なります。");
				session.put("passwordIncorrectErrorMessageList", passwordIncorrectErrorMessageList);
			}

		} else {
			session.put("loginIdErrorMessageList", loginIdErrorMessageList);
			session.put("passwordErrorMessageList", passwordErrorMessageList);
			session.put("newPasswordErrorMessageList", newPasswordErrorMessageList);
			session.put("confirmNewPasswordErrorMessageList", confirmNewPasswordErrorMessageList);
			session.put("newPasswordIncorrectErrorMessageList", newPasswordIncorrectErrorMessageList);
		}
		return result;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}

	public List<String> getConfirmNewPasswordErrorMessageList() {
		return confirmNewPasswordErrorMessageList;
	}

	public void setConfirmNewPasswordErrorMessageList(List<String> confirmNewPasswordErrorMessageList) {
		this.confirmNewPasswordErrorMessageList = confirmNewPasswordErrorMessageList;
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

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getReConfirmationPassword() {
		return confirmNewPassword;
	}

	public void setReConfirmationPassword(String reConfirmationPassword) {
		this.confirmNewPassword = reConfirmationPassword;
	}

	public List<String> getLoginIdErrorMessageList() {
		return loginIdErrorMessageList;
	}

	public void setLoginIdErrorMessageList(List<String> loginIdErrorMessageList) {
		this.loginIdErrorMessageList = loginIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public List<String> getPasswordIncorrectErrorMessageList() {
		return passwordIncorrectErrorMessageList;
	}

	public void setPasswordIncorrectErrorMessageList(List<String> passwordIncorrectErrorMessageList) {
		this.passwordIncorrectErrorMessageList = passwordIncorrectErrorMessageList;
	}

	public List<String> getNewPasswordErrorMessageList() {
		return newPasswordErrorMessageList;
	}

	public void setNewPasswordErrorMessageList(List<String> newPasswordErrorMessageList) {
		this.newPasswordErrorMessageList = newPasswordErrorMessageList;
	}

	public List<String> getconfirmNewPasswordErrorMessageList() {
		return confirmNewPasswordErrorMessageList;
	}

	public void setconfirmNewPasswordErrorMessageList(List<String> confirmNewPasswordErrorMessageList) {
		this.confirmNewPasswordErrorMessageList = confirmNewPasswordErrorMessageList;
	}

	public List<String> getNewPasswordIncorrectErrorMessageList() {
		return newPasswordIncorrectErrorMessageList;
	}

	public void setNewPasswordIncorrectErrorMessageList(List<String> newPasswordIncorrectErrorMessageList) {
		this.newPasswordIncorrectErrorMessageList = newPasswordIncorrectErrorMessageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
