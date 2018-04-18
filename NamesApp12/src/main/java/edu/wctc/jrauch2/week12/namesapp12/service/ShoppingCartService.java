package edu.wctc.jrauch2.week12.namesapp12.service;

import edu.wctc.jrauch2.week12.namesapp12.model.ShoppingCart;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartService {

	private static final Map<String, ShoppingCart> contents = new HashMap<>();

	public ShoppingCart getContents(String sessionId) {
		ShoppingCart cart = contents.computeIfAbsent(sessionId,
			(String t) -> new ShoppingCart());

		return cart;
	}

	public void update(String sessionId, ShoppingCart cart) {
		contents.put(sessionId, cart);	
	}

	public void delete(String sessionId) {
		contents.remove(sessionId);
	}

}
