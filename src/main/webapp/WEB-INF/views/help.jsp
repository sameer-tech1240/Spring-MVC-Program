<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: blue;">This is help page....</h1>
	<%-- <%
	/* String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%> --%>
	<h1>My name is : ${name }</h1>
	<h1>Id is : ${id }</h1>
	<h1>Current time is : ${time }</h1>
	<hr>
	<c:forEach var="item" items="${marks}">
		<h1>Marks of Student : ${item }</h1>
	</c:forEach>
</body>

</html>