/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week10.beans;

import edu.wctc.jrauch2.week10.model.Name;
import edu.wctc.jrauch2.week10.model.ShoppingCart;
import edu.wctc.jrauch2.week10.model.ShoppingCartService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author jmbra
 */
@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {
    private final String sessionId;
    private final ShoppingCart cart;
    private final ShoppingCartService cartService = new ShoppingCartService();
    /**
     * Creates a new instance of CartBean
     */
    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        
        cart = cartService.getContents(sessionId);
    }
    
    public int getNumberOfItemsInCart() {
        return cart.getNumberOfItemsInCart();
    }

    public void addToCart(Name name) {
        cart.add(name);
        cartService.update(sessionId, cart);
    }

}
