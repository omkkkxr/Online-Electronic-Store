<%@page import="java.util.Iterator"%>
<%@page import="pack1.AdminBean"%>
<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product</title>
<link rel="stylesheet" href="css/ViewProductStyle.css">

</head>
<body>
    <h1>View Products</h1>
    <%
    AdminBean abean = (AdminBean) session.getAttribute("abean");
    ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("ProductList");
    out.println("<p style='text-align: center;'>Mr. " + abean.getUfname() + ", here are your product details:</p>");
    
    if (al.size() == 0) {
        out.println("<p style='text-align: center;'>There are no products available!</p>");
    } else {
    %>
    <table>
        <tr>
            <th>Product Code</th>
            <th>Product Name</th>
            <th>Company</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Actions</th>
        </tr>
        <%
        Iterator<ProductBean> i = al.iterator();
        while (i.hasNext()) {
            ProductBean pb = i.next();
        %>
        <tr>
            <td><%= pb.getpCode() %></td>
            <td><%= pb.getpName() %></td>
            <td><%= pb.getpCompany() %></td>
            <td><%= pb.getpPrice() %></td>
            <td><%= pb.getpQty() %></td>
            <td>
                <a href="edit?pcode=<%= pb.getpCode() %>">Edit</a> | 
                <a href="delete?pcode=<%= pb.getpCode() %>">Delete</a>
            </td>
        </tr>
        <%
        }
        %>
    </table>
    <%
    }
    %>
    <a href="logout" class="logout">Logout</a>
</body>
</html>
