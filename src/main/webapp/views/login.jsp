<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Here</h1>
	<h2>${msg}</h2>
	<form action="login" method="POST">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="uname"/></td>
			</tr>

			<tr>
				<td>PassWord</td>
				<td><input type="password" name="pwd"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="login"/></td> 
			</tr>

		</table>
	</form>
</body>
</html>