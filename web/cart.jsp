<%--
  Created by IntelliJ IDEA.
  User: jmbra
  Date: 2/13/2018
  Time: 1:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Byron Supply Company</title>
    <link href="/css/byron_supply_company.css" rel="stylesheet">
    <link href="/css/cart.css" rel="stylesheet">
</head>
<body>
<nav>
    <div class="nav"><a href="index.jsp">Home</a></div>
    <div class="nav"><a href="products.jsp">Products</a></div>
    <div id="navHeader">Byron Supply Company</div>
    <div id="navHeaderSmall">BSC</div>
    <div class="nav"><a href="cart.jsp">Cart</a></div>
    <div class="nav"><a href="account.jsp">Account</a></div>
</nav>
<div id="welcomeBanner">Welcome Back, User!</div>
<div id="emptyDivTopNav"></div>
<div id="cartItemSummary">Cart Summary:</div>
<div id="cartOrderTotals">
    Subtotal: $<span id="subtotal">0</span><br>
    Tax (<span id=taxRate>0.0</span>%): $<span id="taxTotal">0</span><br>
    Total: $<span id="total">0</span>
</div>
<div id="buttons">
    <button id="payNow">Pay Now</button>
</div>
<div id="test">
    test
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.min.js"></script>
</body>
<footer>
</footer>
</html>