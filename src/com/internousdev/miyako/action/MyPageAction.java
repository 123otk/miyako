


package com.internousdev.miyako.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.MyPageDAO;
import com.internousdev.miyako.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {
	//フィールド変数
	public Map<String, Object>session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private ArrayList<MyPageDTO> myPageDTOList = new ArrayList<MyPageDTO>();
	private String message;

    //executeメソッド実行
	public String execute() throws SQLException {
		//LoginAction.javaでid情報を保持できてればtrue→falseとなる。(ログインできてればOK)
		if (!session.containsKey("loginId")) {

			return ERROR;

		}
			String user_master_id = session.get("loginId").toString();
			myPageDTOList = myPageDAO.getMyPageUserInfo(user_master_id);

			session.put("myPageList", myPageDTOList);
			System.out.println(myPageDTOList);
			//↓DAOでリストへ格納したユーザー情報から値を取得する。
			session.put("familyName", myPageDTOList.get(0).getFamilyName());
			session.put("firstName", myPageDTOList.get(0).getFirstName());
			session.put("familyNameKana", myPageDTOList.get(0).getFamilyNameKana());
			session.put("firstNameKana", myPageDTOList.get(0).getFirstNameKana());
			session.put("sex", myPageDTOList.get(0).getSex());
			session.put("email", myPageDTOList.get(0).getEmail());

			return SUCCESS;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<MyPageDTO> getMyPageDTOList() {
		return this.myPageDTOList;
	}
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
