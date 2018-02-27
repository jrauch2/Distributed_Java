<%--
  Created by IntelliJ IDEA.
  User: jmbra
  Date: 2/13/2018
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: jmbra
  Date: 2/13/2018
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Byron Supply Company</title>
    <link href="../css/byron_supply_company.css" rel="stylesheet">
    <link href="../css/index.css" rel="stylesheet">
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
        <div class="nav"><a href="login.jsp">Login</a></div>
        <div>|</div>
        <div class ="nav"><a href="register.jsp">Register</a></div>
    </div>
</div>
<div id="pageLayout">
    <div id="leftPanel"></div>
    <div id="centerPanel"></div>
    <div id="rightPanel"></div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"/>
</body>
<footer>
    Byron Supply Company<br>
    Waukesha, WI<br>
</footer>
</html>