package com.internousdev.miyako.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.PurchaseHistoryInfoDAO;
import com.internousdev.miyako.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware {

	public Map<String, Object>session;
	private int deleteFlg;
	private PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();

	public String delete() throws SQLException {

		if(deleteFlg == 1) {
			System.out.println(deleteFlg);

		String user_master_id = session.get("loginId").toString();

		 int count = purchaseHistoryInfoDAO.deleteAll(user_master_id);
         if(count>0){
		 PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
			List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();
			purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("loginId")));
			Iterator<PurchaseHistoryInfoDTO> iterator = purchaseHistoryInfoDTOList.iterator();
			if(!(iterator.hasNext())) {
				purchaseHistoryInfoDTOList = null;
			}

			//商品購入情報をsessionへ格納
			session.put("purchaseHistoryInfoDTOList", purchaseHistoryInfoDTOList);

		}
		}
		String result = SUCCESS;

		return result;
	}

	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg=deleteFlg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

}



