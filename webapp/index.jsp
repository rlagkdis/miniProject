<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>재고 웹</title>
		<link rel="stylesheet"href="/resources/css/main.css">
	</head>
		<body>
		<c:if test="${sessionScope.memberId eq null }">
			<div id="container">
			<h1>재고 웹</h1>
			<h2>로그인 페이지</h2>
			<fieldset>
				<legend>로그인</legend>
				<form action="/miniProject/member/login.kh" method="post">
					<input type="text" name="member-id" placeholder="ID"> <br>
					<input type="password" name="member-pw" placeholder="PW"> <br>
					<div id="login-area">
						<input type="submit" value="로그인">
						<input type="reset" value="취소">
					</div>
				</form>
			</fieldset>
			<span><a href="member/enrollView.kh">회원가입</a></span>
			</div>
			</c:if>
			
			
			
			
			<c:if test="${sessionScope.memberId ne null }">
				<span id="member-id-span">${sessionScope.memberId }</span>님 환영합니다! <br>
				<input type="hidden" id="member-id" value="${memberId }">
				<!-- <a href="/member/myInfo1.kh?member-id=${sessionScope.memberId }">마이페이지</a> -->
				<!-- a태그의 링크 기능 무효화 :javascript:void(0)-->
				<!-- <a href="javascript:void(0);" onclick="removeCheck();">회원탈퇴</a>-->
				
				
				<a href="product/printName.kh"> 이름으로 조회</a>
				<a href="product/printAllProduct.kh"> 재고조회</a>
				<a href="product/enrollView.kh"> 재고등록</a>
				<a href="product/remove.kh"> 재고삭제</a>
				<a href="product/update.kh"> 재고수정</a>
				<a href="member/logout.kh">로그아웃</a>
			</c:if>
			
			
		</body>
</html>