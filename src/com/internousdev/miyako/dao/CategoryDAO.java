package com.internousdev.miyako.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.util.DBConnector;

//カテゴリー情報取得
public class CategoryDAO {
	public List<CategoryDTO> getCategoryList(){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<CategoryDTO> CategoryDtoList = new ArrayList<CategoryDTO>();
		String sql = "select * from category";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				CategoryDTO CategoryDTO = new CategoryDTO();
				CategoryDTO.setId(resultSet.getInt("id"));
				CategoryDTO.setCategoryId(resultSet.getInt("category_id"));
				CategoryDTO.setCategoryName(resultSet.getString("category_name"));
				CategoryDTO.setCategoryDescription(resultSet.getString("category_description"));
				CategoryDTO.setInsertDate(resultSet.getDate("insert_date"));
				CategoryDTO.setUpdateDate(resultSet.getDate("update_date"));
				CategoryDtoList.add(CategoryDTO);
			}
			Iterator<CategoryDTO> iterator = CategoryDtoList.iterator();
			if(!(iterator.hasNext())) {
				CategoryDtoList = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return CategoryDtoList;
	}
}
