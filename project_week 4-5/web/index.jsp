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
    <link rel="stylesheet" type="text/css" href="./css/byron_supply_company.css" />
    <link rel="stylesheet" type="text/css" href="./css/index.css" />

</head>
<body>
<nav>
    <div class="nav"><a href="./index.jsp">Home</a></div>
    <div class="nav"><a href="./ProductController">Products</a></div>
    <div id="navHeader">Byron Supply Company</div>
    <div id="navHeaderSmall">BSC</div>
    <div class="nav"><a href="./CartController">Cart</a></div>
    <div class="nav"><a href="./AccountController">Account</a></div>
</nav>
<div id="dummyNav"></div>
<div id="welcomeBannerBackground">
    <div id="welcomeBanner">
        <div class="nav"><a href="WEB-INF/login.jsp">Login</a></div>
        <div>|</div>
        <div class ="nav"><a href="WEB-INF/register.jsp">Register</a></div>
    </div>
</div>

<div id="hero">
    <img src="./image/kitchenUtensils.png"/>
</div>
<div>
    <p>Welcome to Byron Supply Company, where you can find all of your stylish, household needs.</p>
</div>

</body>
<footer>
    Byron Supply Company<br>
    Waukesha, WI<br>
</footer>
</html>