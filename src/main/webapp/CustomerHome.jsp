<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Dashboard</title>
<link rel="stylesheet" href="css/CustomerHomeJSP.css">
</head>
<body>
	<div class="container">
		<h1>Customer Dashboard</h1>
		<% 
		CustomerBean cb = (CustomerBean) session.getAttribute("cBean");
		out.println("<span class='welcome'>Welcome " + cb.getCfname() + "</span>");
		%>
		<a href="vcps">View Products</a>
		<a href="logout">Logout</a>
	</div>
</body>
</html>
