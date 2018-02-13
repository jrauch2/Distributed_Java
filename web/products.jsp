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
    <link href="./css/byron_supply_company.css" rel="stylesheet">
    <link href="./css/products.css" rel="stylesheet">
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
    <div id="productsGrid">
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
        </div>
        <div class="product">
            <a href="productdetails.jsp">
                <div class="imgFrame">Product Image</div>
                <span class="productName">Product Name</span><br>
                <span class="ProductInfoSmall">Product Info</span>
            </a>
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