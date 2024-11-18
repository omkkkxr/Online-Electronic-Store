<%@page import="java.util.Iterator"%>
<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products</title>
<link rel="stylesheet" href="css/ViewCustomerProduct.css">
</head>
<body>
	<div class="container">
		<h1>Available Products</h1>
		<%
			CustomerBean cb = (CustomerBean) session.getAttribute("cBean");
			ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("ProductList");
			out.println("<div class='welcome'>Welcome, " + cb.getCfname() + "</div>");
		%>
		<table>
			<tr>
				<th>Product Code</th>
				<th>Product Name</th>
				<th>Company</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Action</th>
			</tr>
			<%
				Iterator<ProductBean> i = al.iterator();
				ProductBean pb;
				while (i.hasNext()) {
					pb = i.next();
					out.println("<tr>");
					out.println("<td>" + pb.getpCode() + "</td>");
					out.println("<td>" + pb.getpName() + "</td>");
					out.println("<td>" + pb.getpCompany() + "</td>");
					out.println("<td>" + pb.getpPrice() + "</td>");
					out.println("<td>" + pb.getpQty() + "</td>");
					out.println("<td><a href='bps?pcode=" + pb.getpCode() + "'>Buy</a></td>");
					out.println("</tr>");
				}
			%>
		</table>
		<a class="logout-btn" href="logout">Logout</a>
	</div>
</body>
</html>
