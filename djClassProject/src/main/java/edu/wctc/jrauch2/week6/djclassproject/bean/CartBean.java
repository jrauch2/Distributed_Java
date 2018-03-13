/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week6.djclassproject.bean;

import edu.wctc.jrauch2.week6.djclassproject.model.Product;
import edu.wctc.jrauch2.week6.djclassproject.model.ProductService;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author jmbra
 */
@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable{
    private final ProductService PRODUCT_SERVICE = new ProductService();
    private Map<Product, Integer> cart;
    private Object productFound;
    private Product product;

    /**
     * Creates a new instance of CartBean
     */
    public CartBean() {
        cart = new HashMap<>();
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }
    
    private Product getProduct(String productID) {
        return PRODUCT_SERVICE.getProduct(productID);
    }
    
    public void addToCart(String productID) {
        product = getProduct(productID);
        productFound = cart.get(product);
        
        if (productFound == null) {
            cart.put(product, 1);
        }
        else {
            cart.put(product, cart.get(product) + 1);
        }
    }
    
    public void updateCart(String productID, int quantity) {
        product = getProduct(productID);
        productFound = cart.get(product);
        
        if (productFound != null && quantity == 0) {
            cart.remove(product);
        } else if (productFound != null){
            cart.put(product, quantity);
        }
    }
        
        
    
}
