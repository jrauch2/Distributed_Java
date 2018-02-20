package edu.wctc.jrauch2.distributedjava.controller;

import edu.wctc.jrauch2.distributedjava.model.ProductService;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "ProductController")
public class ProductController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        ProductService productService = new ProductService();
        RequestDispatcher dispatcher;

        String productID = request.getParameter("productID");

        if (productID != null) {
            request.setAttribute("product", productService.getProduct(productID));
            dispatcher = request.getRequestDispatcher("/WEB-INF/productDetails.jsp");
        } else {
            request.setAttribute("productList", productService.getProductList());
            dispatcher = request.getRequestDispatcher("/WEB-INF/products.jsp");
        }
        dispatcher.forward(request, response);
    }
}
