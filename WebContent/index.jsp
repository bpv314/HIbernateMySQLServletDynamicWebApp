<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
<h2>Member Registration</h2>
<form action="register" method="post">
<table cellpadding="3pt">
	<tr><td>First Name: </td><td><input type="text" size="30" name="firstName"></td></tr>
	<tr><td>Last Name: </td><td><input type="text" size="30" name="lastName"></td></tr>
	<tr><td>Username: </td><td><input type="text" size="30" name="username"></td></tr>
	<tr><td>Password: </td><td><input type="password" size="30" name="password"></td></tr>
	<tr><td>City </td><td><input type="text" size="30" name="city"></td></tr>
	<p><p>
	<tr><td colspan="2" align="center"><input type="submit" value="Register"></td></tr>
</table>
</form>
</body>
</html>