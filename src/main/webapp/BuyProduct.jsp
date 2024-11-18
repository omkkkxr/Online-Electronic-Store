<%@page import="pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Product</title>
<link rel="stylesheet" href="css/BuyProduct.css">
</head>
<body>
	<div class="container">
		<h1>Buy Product</h1>
		<%
			ProductBean pb = (ProductBean) request.getAttribute("BuyBean");					
		%>
		<form action="ucps" method="post">
			<label for="pcode">Product Code</label>
			<input type="text" id="pcode" name="pcode" value="<%= pb.getpCode() %>" class="readonly" readonly>
			
			<label for="pname">Product Name</label>
			<input type="text" id="pname" name="pname" value="<%= pb.getpName() %>" class="readonly" readonly>
			
			<label for="pcompany">Product Company</label>
			<input type="text" id="pcompany" name="pcompany" value="<%= pb.getpCompany() %>" class="readonly" readonly>
			
			<label for="pprice">Product Price</label>
			<input type="text" id="pprice" name="pprice" value="<%= pb.getpPrice() %>" class="readonly" readonly>
			
			<label for="pqty">Available Quantity</label>
			<input type="text" id="pqty" name="pqty" value="<%= pb.getpQty() %>" class="readonly" readonly>
			
			<label for="reqno">Required Quantity</label>
			<input type="number" id="reqno" name="reqno" placeholder="Enter quantity" required>
			
			<input type="submit" value="Buy">
		</form>
	</div>
</body>
</html>
