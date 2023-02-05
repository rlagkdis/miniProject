package product.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.service.ProductService;
import product.model.vo.Product;

@WebServlet("/product/enrollView.kh")
public class ProductEnrollServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/product/enroll.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String productName = request.getParameter("product-name");
		int productPrice = Integer.parseInt(request.getParameter("product-price"));
		int productCount = Integer.parseInt(request.getParameter("product-count"));
		Product product = new Product(productName, productPrice, productCount);
		ProductService pService = new ProductService();
		int result = pService.registerProduct(product);
		if (result > 0) {
			response.sendRedirect(("/miniProject/index.jsp"));
		} else {
			request.setAttribute("title", "등록 실패");
			request.setAttribute("msg", "등록이 완료되지 않았습니다.");
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}
		
		
	}

}
