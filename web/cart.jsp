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
    <link href="./css/byron_supply_company.css" rel="stylesheet">
    <link href="./css/cart.css" rel="stylesheet">
</head>
<body>
<nav>
    <div class="nav"><a href="tempIndex.html">Home</a></div>
    <div class="nav"><a href="tempProducts.html">Products</a></div>
    <div id="navHeader">Byron Supply Company</div>
    <div id="navHeaderSmall">BSC</div>
    <div class="nav"><a href="tempCart.html">Cart</a></div>
    <div class="nav"><a href="tempAccount.html">Account</a></div>
</nav>
<div id="dummyNav"></div>
<div id="welcomeBannerBackground">
    <div id="welcomeBanner">
        <div class="nav"><a href="tempLogin.html">Login</a></div>
        <div>|</div>
        <div class ="nav"><a href="tempRegister.html">Register</a></div>
    </div>
</div>
<div id="pageLayout">
    <div id="leftPanel"></div>
    <div id="centerPanel">
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

    </div>
    <div id="rightPanel"></div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</body>
<footer>
    Byron Supply Company<br>
    Waukesha, WI<br>
</footer>
</html>
