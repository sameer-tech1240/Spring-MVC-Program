 <%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Hello MVC</h1>
	<h1>Called by home controller</h1>
	<h1>url/home</h1>
	<h1>Name is .....</h1>
	<%
	String name = (String) request.getAttribute("name");
	String ageString = (String) request.getAttribute("age");
	
	%>

	<h1>
		Name is : ${name}</h1>

	

</body>
</html>