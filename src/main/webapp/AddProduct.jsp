<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<center>
		<h1>
			<%
			AdminBean abean = (AdminBean) session.getAttribute("abean");
			String msg = (String) request.getAttribute("msg");
			out.println(msg + " Mr. " + abean.getUfname() + " !!<br><br>");
			%>
			<a href="AddProduct.html">Add Product</a><br> <br> 
			<a	href="view1">View Product</a><br> <br> 
			<a	href="logout">Logout</a>
			
</body>
</html>