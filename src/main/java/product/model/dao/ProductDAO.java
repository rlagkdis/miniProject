package product.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import product.model.vo.Product;

public class ProductDAO {

	public int InsertProduct(Connection conn, Product product) {
		String query = "INSERT INTO PRODUCT VALUES(?,?,?)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductPrice());
			pstmt.setInt(3, product.getProductCount());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int deleteProduct(Connection conn, String productName) {
		String query = "DELETE FROM PRODUCT WHERE PRODUCT_NAME = ?";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, productName);
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int updateProduct(Connection conn, Product product) {
		String query = "UPDATE PRODUCT SET PRODUCT_COUNT = ? WHERE PRODUCT_NAME = ?";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, product.getProductCount());
			pstmt.setString(2, product.getProductName());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Product printNameProduct(Connection conn, String productName) {
		String query = "SELECT * FROM PRODUCT WHERE PRODUCT_NAME = ?";
		int result = 0;
		Product product = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, productName);
			ResultSet rset = pstmt.executeQuery();
			while(rset.next()) {
				product = new Product();
				product.setProductName(rset.getString("PRODUCT_NAME"));
				product.setProductPrice(rset.getInt("PRODUCT_PRICE"));
				product.setProductCount(rset.getInt("PRODUCT_COUNT"));
			}
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return product;
	}


	public List<Product> printAllProduct(Connection conn) {
		String query = "SELECT * FROM PRODUCT";
		int result = 0;
		Product product = null;
		List<Product> pList = new ArrayList<Product>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rset = pstmt.executeQuery();
			while(rset.next()) {
				product = new Product();
				product.setProductName(rset.getString("PRODUCT_NAME"));
				product.setProductPrice(rset.getInt("PRODUCT_PRICE"));
				product.setProductCount(rset.getInt("PRODUCT_COUNT"));
				pList.add(product);
			}
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pList;
		
	}

}
