<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>재고등록</title>
		<link rel="stylesheet"href="/miniProject/resources/css/member.css">
	</head>
<body>
	<h1>재고등록</h1>
	<h3>재고를 입력하세요</h3>
	<div>
		<form action="/miniProject/product/enrollView.kh" method="post">
		<fieldset>
			<legend>재고등록</legend>
			<ul id="product-register">
				<li>
					<label for="product-name">상품 이름</label>
					<input type="text" id="product-name" name="product-name">
				</li>
				<li>
					<label for="product-price">상품 가격</label>
					<input type="text" id="product-price" name="product-price">
				</li>
				<li>
					<label for="product-count">상품 수량</label>
					<input type="text" id="product-count" name="product-count">
				</li>
				
			</ul>
		</fieldset>
		<div>
			<input type="submit" value="등록하기">
			<input type="reset" value="초기화">
		</div>
		</form>
	
	</div>
</body>
</html>