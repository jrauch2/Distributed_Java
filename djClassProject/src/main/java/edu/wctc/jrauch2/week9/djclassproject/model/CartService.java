package edu.wctc.jrauch2.week9.djclassproject.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CartService {

	private static final Map<String, Cart> contents = new HashMap<>();

	public Cart getContents(String sessionId) {
		Cart cart = contents.computeIfAbsent(sessionId, (String t) -> new Cart());
		return cart;
	}

	public void update(String sessionId, Cart cart) {
		contents.put(sessionId, cart);	
	}

	public void delete(String sessionId) {
		contents.remove(sessionId);
	}

}
