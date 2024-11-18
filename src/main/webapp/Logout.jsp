<%@page import="oracle.jdbc.internal.OracleConnection.XSSessionOperationCode"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
<link rel="stylesheet" href="css/LogoutJSPStyles.css">
</head>
<body>
	<%
	session.invalidate();
	out.println("<center> <h1>Logged out successfully !!<br><br></center> </h1>");
	%>
	<jsp:include page="index.html"/>
</body>
</html>