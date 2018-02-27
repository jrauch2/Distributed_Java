package edu.wctc.jrauch2.distributedjava.controller;

import edu.wctc.jrauch2.distributedjava.model.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CartController")
public class CartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cart cart = new Cart();
        HttpSession session = request.getSession();
        session.setAttribute("cart", cart);
        RequestDispatcher dispatcher;

        dispatcher = request.getRequestDispatcher("/WEB-INF/cart.jsp");
        dispatcher.forward(request, response);
    }
}
