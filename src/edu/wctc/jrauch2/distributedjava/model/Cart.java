package edu.wctc.jrauch2.distributedjava.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final static Map<Product, Integer> cart = new HashMap<>();
    private BigDecimal subtotal = new BigDecimal(0);
    private BigDecimal taxRate = new BigDecimal(0);
    private Object productFound;

    public Cart() {}

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void addToCart(Product product) {
        productFound = cart.get(product);
        if (productFound == null) {
            cart.put(product, new Integer(1));
        } else {
            cart.put(product, cart.get(product) + 1);
        }
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public BigDecimal getGrandTotal() {
        return subtotal.multiply(taxRate.divide(new BigDecimal(100)));
    }

    public int getTotalCartItems() {
        int sum = 0;
        for (int i: cart.values()) {
            sum += i;
        }
        return sum;
    }
}
