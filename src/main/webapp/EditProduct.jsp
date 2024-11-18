<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<center>
		<h1>
			<%
			AdminBean abean = (AdminBean) session.getAttribute("abean");
			//ArrayList<ProductBean> al = (ArrayList<ProductBean>) request.getAttribute("ProductList");
			ProductBean pb = (ProductBean) request.getAttribute("pBean");
			out.println("Mr. " + abean.getUfname() + " please edit<br><br>");
			%>
			<form action="update" method="post">
				Product Price <input type="text" name="pprice" value="<%=pb.getpPrice()%>"><br><br> 
				Product Quantity <input type="text" name="pqty" value="<%=pb.getpQty()%>"><br><br>
				<input type="hidden" name="pcode" value="<%= pb.getpCode() %>">
				<input type="submit" value="Update Product Details">
			</form>
</body>
</html>