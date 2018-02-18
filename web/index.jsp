<%--
  Created by IntelliJ IDEA.
  User: jmbra
  Date: 2/13/2018
  Time: 1:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Byron Supply Company</title>
    <link href="./css/byron_supply_company.css" rel="stylesheet">
    <link href="./css/index.css" rel="stylesheet">
</head>
<body>
<nav>
    <div class="nav"><a href="index.jsp">Home</a></div>
    <div class="nav"><a href="/Distributed_Java_war_exploded/ProductController">Products</a></div>
    <div id="navHeader">Byron Supply Company</div>
    <div id="navHeaderSmall">BSC</div>
    <div class="nav"><a href="WEB-INF/cart.jsp">Cart</a></div>
    <div class="nav"><a href="WEB-INF/account.jsp">Account</a></div>
</nav>
<div id="dummyNav"></div>
<div id="welcomeBannerBackground">
    <div id="welcomeBanner">
        <div class="nav"><a href="WEB-INF/login.jsp">Login</a></div>
        <div>|</div>
        <div class ="nav"><a href="WEB-INF/register.jsp">Register</a></div>
    </div>
</div>

<div id="slides">
    banner image goes here.
</div>
<div>
    <p>Welcome to Byron Supply Company, where you can find all of your stylish, household needs.</p>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="WEB-INF/js"></script>
</body>
<footer>
    Byron Supply Company<br>
    Waukesha, WI<br>
</footer>
</html>