<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<form action="addUser.do" method="post">
		<table border="" width = "400" height = "600">
			<tr>
				<th align="center">Category</th>
				<th>Input</th>
			</tr>
			<tr>
				<td>ID </td>
				<td><input type="text" name = "password"></td>
			</tr>
			<tr>
				<td>Password </td>
				<td><input type="password" name = "pw" id = "password"></td>
			</tr>
			<tr>
				<td>Check Password </td>
				<td><input type="password" id = "checkpassword"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name = "name"></td>
			</tr>
			<tr>
				<td>Tel</td>
				<td><input type="tel" name = "tel" maxlength="11"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name = "address"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name = "email"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" cellpadding = "100" cellspacing = "200px">
					<a href="javascript:" >Create Membership</a> <!-- 추후에 회원가입 , 뒤로 가기 코드 작성. -->
					<a href="javascript:"> Return </a>
				</td>
			</tr>
		</table>
	</form>
</div>



</body>
</html>