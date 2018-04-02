package edu.wctc.jrauch2.week9.djclassproject.bean;

import edu.wctc.jrauch2.week9.djclassproject.model.Cart;
import edu.wctc.jrauch2.week9.djclassproject.model.CartService;
import edu.wctc.jrauch2.week9.djclassproject.model.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;

@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {

	private final String sessionId;
	private final Cart cart;
	private final CartService cartService;
        private Product activeProduct;

	public CartBean() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		sessionId = facesContext.getExternalContext().getSessionId(true);
                cartService = new CartService();
		cart = cartService.getContents(sessionId);
	}

	public int getNumberOfItemsInCart() {
		return cart.getNumberOfItemsInCart();
	}

	public void addToCart(Product product) {
		cart.add(product);
		cartService.update(sessionId, cart);
	}
        
        public void updateCartQuantity(Product product, int quantity) {
            cart.updateProductQuantity(product, quantity);
        }
        
        public Map<Product, Integer> getContents() {
            return cart.getContents();
        }
        
        public List<Product> getKeyList() {
            return cart.getKeyList();
        }
        
        public Cart getCart() {
            return cart;
        }

	
}
