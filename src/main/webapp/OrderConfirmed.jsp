<!DOCTYPE html>
<%@page import="pack1.CustomerBean"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Order Placed</title>
    <link rel="stylesheet" href="css/OrderConfirm.css">
</head>
<body>
    <div class="container">
        <h1>Order Confirmation</h1>
        <% 
        CustomerBean cb = (CustomerBean) session.getAttribute("cBean");
        String cAmt = (String) request.getAttribute("cAmt");
        %>
        <p>Hello, <span class="highlight"><%= cb.getCfname() %></span></p>
        <p>You have been charged <span class="highlight"><%= cAmt %> Rs</span>.</p>
        <p>Your order has been placed successfully!</p>
        <a href="vcps">View Products</a>
        <a href="logout">Logout</a>
    </div>
</body>
</html>
