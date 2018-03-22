package edu.wctc.jrauch2.week6.djclassproject.bean;

import edu.wctc.jrauch2.week6.djclassproject.model.Cart;
import edu.wctc.jrauch2.week6.djclassproject.model.CartService;
import edu.wctc.jrauch2.week6.djclassproject.model.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {

	private final String sessionId;
	private final Cart cart;
	private final CartService cartService = new CartService();

	public CartBean() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		sessionId = facesContext.getExternalContext().getSessionId(true);
		cart = cartService.getContents(sessionId);
	}

	public int getNumberOfItemsInCart() {
		return cart.getNumberOfItemsInCart();
	}

	public void addToCart(Product product) {
		cart.add(product);
		cartService.update(sessionId, cart);
	}
        
        public Cart getCart() {
            return cart;
        }

	
}
