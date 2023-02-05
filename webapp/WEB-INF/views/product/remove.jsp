<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>재고삭제</title>
		<link rel="stylesheet"href="/miniProject/resources/css/member.css">
	</head>
	<body>
		<h1>재고삭제</h1>
		<h3>재고이름을 입력하세요</h3>
		<div>
			<form action="/miniProject/product/remove.kh" method="post">
			<fieldset>
				<legend>재고삭제</legend>
				<ul id="product-update">
					<li>
						<label for="product-name">상품 이름</label>
						<input type="text" id="product-name" name="product-name">
					</li>
				</ul>
			</fieldset>
			<input type="submit" value="삭제하기">
			</form>
		
		</div>
	</body>
</html>