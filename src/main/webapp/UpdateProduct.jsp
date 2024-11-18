<%@page import="pack1.AdminBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body><center><h1>	
	<%
		String msg=(String)request.getAttribute("msg");
		AdminBean abean=(AdminBean)session.getAttribute("abean");
		out.println("Hello "+abean.getUfname()+"<br><br>"+msg+"<br><br>");		
	%>
			<a href="AddProduct.html">Add Product</a><br> <br> 
			<a	href="view1">View Product</a><br> <br> 
			<a	href="logout">Logout</a>
	
</body>
</html>