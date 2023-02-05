<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>제품 목록</title>
		<link rel="stylesheet" href="/miniProject/resources/css/notice.css"></link>
	</head>
	<body>
		<h1>제품 목록</h1>
		<form action="/miniProject/index.jsp" method="get">
		
		<table>
			<colgroup>
				<col style="33.3%">
				<col width="33.3%">
				<col width="33.3%">
			</colgroup>
			<thead>
				<tr>
				 <th>상품 이름</th>
				 <th>상품 가격</th>
				 <th>상품 수량</th>
			</thead>
		<tbody>
			<c:forEach items="${pList }" var="list">
				<tr>
					<td style = "text-align:center;">${list.productName }</td>
					<td style = "text-align:center;">${list.productPrice }</td>
					<td style = "text-align:center;">${list.productCount }</td>
				</tr>
				</c:forEach>
		</tbody>
		<input type="submit" value="뒤로가기">
		</table>
		</form>
	</body>
</html>