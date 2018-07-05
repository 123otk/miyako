package com.internousdev.miyako.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miyako.dto.ProductInfoDTO;
import com.internousdev.miyako.util.DBConnector;

public class MasterDAO {

	public ArrayList<ProductInfoDTO> getProductInfo() throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		ArrayList<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT id, product_id, product_name, product_name_kana, category_id, price, product_stock, image_file_path, image_file_name FROM product_info";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductName(rs.getString("product_name"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setProductStock(rs.getInt("product_stock"));
				dto.setPrice(rs.getInt("price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				productInfoDtoList.add(dto);
			}

		}catch(SQLException e) {

			e.printStackTrace();

		}finally {

			con.close();

		}

		return productInfoDtoList;

	}


	public ArrayList<ProductInfoDTO> getProductInfo(String productId) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		ArrayList<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT id, product_id, product_name, product_name_kana, category_id, price, product_stock, image_file_path, image_file_name FROM product_info where product_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, productId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductName(rs.getString("product_name"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setProductStock(rs.getInt("product_stock"));
				dto.setPrice(rs.getInt("price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				productInfoDtoList.add(dto);
			}

		}catch(SQLException e) {

			e.printStackTrace();

		}finally {

			con.close();

		}

		return productInfoDtoList;

	}


	public int updateStock(int totalProductStock, int productId) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "UPDATE product_info SET product_stock=? WHERE product_id=?";
		int stock = 0;
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, totalProductStock);
			ps.setInt(2, productId);
/*			ps.executeQuery();*/


			 	stock = ps.executeUpdate(); //Written by NKira


		}catch(SQLException e) {

			e.printStackTrace();

		}finally {

			con.close();
		}

		return stock; //Written by NKira
	}

}
