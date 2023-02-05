package product.model.service;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import product.model.dao.ProductDAO;
import product.model.vo.Product;

public class ProductService {
	
	private ProductDAO pDao;
	
	public ProductService() {
		pDao = new ProductDAO();
	}

	public int registerProduct(Product product) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = pDao.InsertProduct(conn, product);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	public int deleteProduct(String productName) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = pDao.deleteProduct(conn, productName);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	public int updateProduct(Product product) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = pDao.updateProduct(conn, product);
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	public Product printNameProduct(String productName) {
		Product product = null;
		Connection conn = JDBCTemplate.getConnection();
		product = pDao.printNameProduct(conn, productName);
		
		return product;
	}

	public List<Product> printAllProduct() {
		Connection conn = JDBCTemplate.getConnection();
		List<Product> pList = pDao.printAllProduct(conn);
		return pList;
	}

}
