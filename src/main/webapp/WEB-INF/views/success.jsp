<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 class="text-center" style="color: blue; background: yellow;">${Header}</h1>
	<p class="text-center" style="color: blue; background: yellow;">
		<b>${Desc}</b>
	</p>
	<h1 style="color: green;">${message}</h1>

	<h1 style="color: purple;">Welcome , ${user.userName}</h1>
	<h1 style="color: purple;">Your email address is ${user.email}</h1>
	<h1 style="color: purple;">Your password is ${user.password} try
		to secure the password</h1>

</body>
</html>