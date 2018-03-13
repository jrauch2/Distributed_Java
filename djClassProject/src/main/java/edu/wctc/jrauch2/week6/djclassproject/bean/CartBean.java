/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week6.djclassproject.bean;

import edu.wctc.jrauch2.week6.djclassproject.model.Product;
import edu.wctc.jrauch2.week6.djclassproject.model.ProductService;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author jmbra
 */
@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {
    private final ProductService PRODUCT_SERVICE = new ProductService();
    private final Map<Product, Integer> CART;
    private Object productFound;
    private Product product;
    private String productID;

    /**
     * Creates a new instance of CartBean
     */
    public CartBean() {
        CART = new HashMap<>();
    }

    public Map<Product, Integer> getCART() {
        return CART;
    }
    
    public void addToCart(AjaxBehaviorEvent event) {
        try {
            productID = (String) event.getComponent().getAttributes().get("productID");
            product = PRODUCT_SERVICE.getProduct(productID);
            productFound = CART.get(product);

            if (productFound == null) {
                CART.put(product, 1);
            }
            else {
                CART.put(product, CART.get(product) + 1);
            }

            FacesContext.getCurrentInstance().getExternalContext().redirect("cart.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ProductBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateCart(String productID, int quantity) {
        product = PRODUCT_SERVICE.getProduct(productID);
        productFound = CART.get(product);
        
        if (productFound != null && quantity == 0) {
            CART.remove(product);
        } else if (productFound != null){
            CART.put(product, quantity);
        }
    }    
}
