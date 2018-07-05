package com.internousdev.miyako.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miyako.dto.MyPageDTO;
import com.internousdev.miyako.util.DBConnector;

public class MyPageDAO {



	public ArrayList<MyPageDTO> getMyPageUserInfo
			(String user_master_id) throws SQLException {
		    DBConnector dbConnector = new DBConnector();
	        Connection connection = dbConnector.getConnection();
		    ArrayList<MyPageDTO> myPageDTOList = new ArrayList<MyPageDTO>();


		    //user_info情報一式取得
		    String sql =
		    		"SELECT * from user_info where user_id=?";

		    try {

		    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
		    	/*preparedStatement.setString(1, item_transaction_id);*/

		    	preparedStatement.setString(1, user_master_id);

		    	//検索結果取得
		    	ResultSet resultSet = preparedStatement.executeQuery();

		    	//DTOへ情報を格納する
		    	while(resultSet.next()) {
		    		MyPageDTO dto = new MyPageDTO();
		    		dto.setId(resultSet.getInt("id"));
		    		dto.setUserId(resultSet.getString("user_id"));
		    		dto.setPassword(resultSet.getString("password"));
		    		dto.setFamilyName(resultSet.getString("family_name"));
		    		dto.setFirstName(resultSet.getString("first_name"));
		    		dto.setFamilyNameKana(resultSet.getString("family_name_kana"));
		    		dto.setFirstNameKana(resultSet.getString("first_name_kana"));
		    		dto.setSex(resultSet.getInt("sex"));
		    		dto.setEmail(resultSet.getString("email"));
		    		dto.setStatus(resultSet.getString("status"));
		    		dto.setLogined(resultSet.getInt("logined"));
		    		dto.setRegistDate(resultSet.getDate("regist_date"));
		    		/*dto.setUpdateDate(resultSet.getDate("update_date"));*/
		    		myPageDTOList.add(dto);
		    	}
		    }catch(Exception e){
		    	e.printStackTrace();
		    }finally{
		    	connection.close();
		    }

		    return myPageDTOList;
	}


}
