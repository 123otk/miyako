package com.internousdev.miyako.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.miyako.dto.CartInfoDTO;
import com.internousdev.miyako.util.DBConnector;


public class CartInfoDAO {
	//getCartInfoDtoListメソッド
    public List<CartInfoDTO> getCartInfoDtoList(String loginId){
    	//フィールド値設定
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
    	//SQL select文
    	String sql="select"
    			+ " ci.id as id,"
    			+ " ci.user_id as user_id,"
    			+ " ci.temp_user_id as temp_user_id,"
    			+ " ci.product_id as product_id,"
    			+ " sum(ci.product_count) as product_count,"
    			+ " pi.price as price,"
    			+ " pi.regist_date as regist_date,"
    			+ " pi.update_date as update_date,"
    			+ " pi.product_name as product_name,"
    			+ " pi.product_name_kana as product_name_kana,"
    			+ " pi.product_description as product_description,"
    			+ " pi.category_id as category_id,"
    			+ " pi.image_file_path as image_file_path, "
    			+ " pi.image_file_name as image_file_name, "
    			+ " pi.release_date as release_date,"
    			+ " pi.release_company as release_company,"
    			+ " pi.status as status,"
    			+ " (sum(ci.product_count) * pi.price) as subtotal"
    			+ " FROM cart_info as ci"
    			+ " LEFT JOIN product_info as pi"
    			+ " ON ci.product_id = pi.product_id"
    			+ " WHERE ci.user_id = ?"
    			+ " group by product_id";
    	//try-catch文でカートの各情報を格納後、リストへ(毎度ユーザーIDを拾ってくるのは念のためのはず)
    	try{
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		System.out.println("cartinfodao-getcartinfodtolist:"+loginId);
    		preparedStatement.setString(1, loginId);
    		ResultSet resultSet = preparedStatement.executeQuery();
    		while(resultSet.next()){
    			CartInfoDTO cartInfoDTO = new CartInfoDTO();
    			cartInfoDTO.setId(resultSet.getInt("id"));
    			cartInfoDTO.setUserId(resultSet.getString("user_id"));
    			cartInfoDTO.setTempUserId(resultSet.getString("temp_user_id"));
    			cartInfoDTO.setProductId(resultSet.getInt("product_id"));
    			cartInfoDTO.setProductCount(resultSet.getInt("product_count"));
    			cartInfoDTO.setPrice(resultSet.getInt("price"));
    			cartInfoDTO.setRegistDate(resultSet.getDate("regist_date"));
    			cartInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
    			cartInfoDTO.setProductName(resultSet.getString("product_name"));
    			cartInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
    		    cartInfoDTO.setProductDescription(resultSet.getString("product_description"));
    		    cartInfoDTO.setCategoryId(resultSet.getInt("category_id"));
    		    cartInfoDTO.setImageFilePath(resultSet.getString("image_file_path"));
    		    cartInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
    		    cartInfoDTO.setReleaseDate(resultSet.getDate("release_date"));
    		    cartInfoDTO.setReleaseCompany(resultSet.getString("release_company"));
    		    cartInfoDTO.setStatus(resultSet.getString("status"));
    		    cartInfoDTO.setSubtotal(resultSet.getInt("subtotal"));
    		    cartInfoDtoList.add(cartInfoDTO);
    		    }
    	}catch (SQLException e){
    		e.printStackTrace();
    	}
    	try{
    		connection.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return cartInfoDtoList;
    }
    //getTotalPriceメソッド
    public int getTotalPrice(String userId){
    	int totalPrice = 0;
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	//select文
    	String sql = "select sum(product_count * price) as total_price from cart_info where user_id=? group by user_id";
        try{
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	preparedStatement.setString(1, userId);
        	ResultSet resultSet = preparedStatement.executeQuery();
        	if(resultSet.next()){
        		totalPrice = resultSet.getInt("total_price");
        		}
        	}catch(SQLException e){
        		e.printStackTrace();
        	}
        try {

        	connection.close();
        	       return totalPrice;
        	} catch (SQLException e) {

        	e.printStackTrace();

        	}
            return totalPrice;
        }
    //registメソッド(カートへ情報登録メソッド[AddCartAction用])
    public int regist(String userId,String tempUserId,int productId,String productCount,int price){
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	int count = 0;
    	String sql = "insert into cart_info(user_id, temp_user_id, product_id, product_count, price, regist_date)"
				+ " values (?, ?, ?, ?, ?, now())";

    	try{
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1, userId);
    		preparedStatement.setString(2, tempUserId);
    		preparedStatement.setInt(3, productId);
    		preparedStatement.setString(4, productCount);
    		preparedStatement.setInt(5, price);

    		count = preparedStatement.executeUpdate();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	try{
    		connection.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return count;
    	}
    //ユーザーのカートに同じ商品があるか判定するメソッド(F5封殺メソッド)
    public boolean sameProductExistByUser(String userId,String tempUserId, int productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;

		String sql = "SELECT * FROM cart_info WHERE user_id = ? AND temp_user_id = ? AND product_id = ? ";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			ps.setInt(3, productId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				result = true;
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}

    //重複時にカート内の購入個数を変更するメソッド
    public int updateProductCount(String userId,String tempUserId, int productId, int productCount, int price){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;

		String sql = "UPDATE cart_info SET update_date = NOW(), product_count = product_count + ? WHERE user_id = ? AND temp_user_id= ? AND product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			ps.setInt(3, productId);

			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return count;
	}

    public int delete(String productId ){
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	int count = 0;
    	String sql = "delete from cart_info where product_id=?";

    	try{
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1, productId);

    		count = preparedStatement.executeUpdate();
    	}catch (SQLException e){
    		e.printStackTrace();
    	}
    	try {
    		connection.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return count;
    }

    public int deleteAll(String userId) {
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	int count = 0;
    	String sql = "delete  from cart_info where user_id=?";

    	try{
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1, userId);

    		count = preparedStatement.executeUpdate();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	try{
    		connection.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return count;
    }

    public void changeStockCount(int productStock, int productId) throws SQLException{
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	String sql = "UPDATE product_info SET product_stock=product_stock - ? WHERE product_id = ?";
    	try{
    		connection = dbConnector.getConnection();
    		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
    		preparedStatement.setInt(1, productStock);
    		preparedStatement.setInt(2, productId);
    		preparedStatement.executeUpdate();
    	}catch (SQLException e){
    		throw new RuntimeException(e);
    	}finally{
    		connection.close();
    	}
    }

    public boolean isExistsCartInfo(){
    	return false;
    }

    public int linkToLoginId(String tempUserId, String loginId){
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();
    	int count = 0;
    	String sql = "update cart_info set user_id=?, temp_user_id = ? where temp_user_id=?";

    	try{
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1, loginId);
    		preparedStatement.setString(2, loginId);
    		preparedStatement.setString(3, tempUserId);
    		count = preparedStatement.executeUpdate();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	try{
    		connection.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return count;
    }
}
