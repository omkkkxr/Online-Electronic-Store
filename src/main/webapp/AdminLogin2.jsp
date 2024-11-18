<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<%
		String msg=(String)request.getAttribute("msg");
		out.println("<center><h1>"+msg+"</center></h1>");	
	%>
	<jsp:include page="AdminLogin.html"/>
</body>
</html>