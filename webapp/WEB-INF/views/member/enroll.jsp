<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<link rel="stylesheet"href="/resources/css/member.css">
	</head>
<body>
	<h1>회원가입</h1>
	<h3>회원정보를 입력하세요</h3>
	<div>
		<form action="/miniProject/member/enrollView.kh" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<ul id="member-register">
				<li>
					<label for="member-id">아이디</label>
					<input type="text" id="member-id" name="member-id">
				</li>
				<li>
					<label for="member-pw">비밀번호</label>
					<input type="password" id="member-pw" name="member-pw">
				</li>
				<li>
					<label for="member-name">이름</label>
					<input type="text" id="member-name" name="member-name">
				</li>
				
				<li>
					<label for="email">이메일</label>
					<input type="text" id="email" name="member-email">
				</li>
				<li>
					<label for="phone">전화번호</label>
					<input type="text" id="phone" name="member-phone">
				</li>
				
				
			</ul>
		</fieldset>
		<div>
			<input type="submit" value="가입하기">
			<input type="reset" value="초기화">
		</div>
		</form>
	
	</div>
</body>
</html>