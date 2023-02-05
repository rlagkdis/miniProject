<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>재고수정</title>
		<link rel="stylesheet"href="/miniProject/resources/css/member.css">
	</head>
	<body>
		<h1>재고수정</h1>
		<h3>이름, 수량을 입력하세요</h3>
		<div>
			<form action="/miniProject/product/update.kh" method="post">
			<fieldset>
				<legend>재고수정</legend>
				<ul id="product-remove">
					<li>
						<label for="product-name">상품 이름</label>
						<input type="text" id="product-name" name="product-name">
					</li>
					<li>
						<label for="product-count">상품 수량</label>
						<input type="text" id="product-count" name="product-count">
					</li>
				</ul>
			</fieldset>
			<input type="submit" value="수정하기">
			</form>
		
		</div>
	</body>
</html>