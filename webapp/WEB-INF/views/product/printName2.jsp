<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>재고조회</title>
		<link rel="stylesheet"href="/miniProject/resources/css/member.css">
	</head>
<body>
	<h1>재고조회</h1>
	<div>
		<form action="/miniProject/index.jsp" method="get">
		<fieldset>
			<legend>재고조회</legend>
			<ul id="product-register">
				<li>
					<label for="product-name">상품 이름</label>
					<input type="text" id="product-name" name="product-name" value="${product.productName }" readonly>
				</li>
				<li>
					<label for="product-price">상품 가격</label>
					<input type="text" id="product-price" name="product-price" value="${product.productPrice }" readonly>
				</li>
				<li>
					<label for="product-count">상품 수량</label>
					<input type="text" id="product-count" name="product-count" value="${product.productCount }" readonly>
				</li>
				
			</ul>
		</fieldset>
		<input type="submit" value="뒤로가기">
		</form>
	
	</div>
</body>
</html>