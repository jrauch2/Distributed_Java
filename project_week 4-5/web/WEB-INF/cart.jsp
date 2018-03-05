<%--
  Created by IntelliJ IDEA.
  User: jmbra
  Date: 2/13/2018
  Time: 1:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Byron Supply Company</title>
    <link href="./css/byron_supply_company.css" rel="stylesheet">
    <link href="./css/cart.css" rel="stylesheet">
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
    <div id="centerPanel">
        <div id="cartItemSummary">
            Cart Summary:<br>
            <c:forEach items="${cart.getCart()}" var="cartItem">
                <div class="cartItem">
                    <img src="<${cartItem.image}" alt="product image">
                    <%--quantity--%>
                    ${cartItem.name}
                </div>
            </c:forEach>
        </div>

        <div id="cartOrderTotals">
            Subtotal: $<span id="subtotal"><c:out value="${cart.subtotal}"/></span><br>
            Tax (<span id=taxRate>0.0</span>%): $<span id="taxTotal"><c:out value="${cart.tax}"/></span><br>
            Total: $<span id="total"><c:out value="${cart.grandTotal}"/></span>
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
