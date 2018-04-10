package edu.wctc.jrauch2.week10.djclassproject.service;

import edu.wctc.jrauch2.week10.djclassproject.model.Cart;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class CartService {

	private static final Map<String, Cart> CONTENTS = new HashMap<>();

	public Cart getContents(String sessionId) {
		Cart cart = CONTENTS.computeIfAbsent(sessionId, (String t) -> new Cart());
		return cart;
	}

	public void update(String sessionId, Cart cart) {
		CONTENTS.put(sessionId, cart);	
	}

	public void delete(String sessionId) {
		CONTENTS.remove(sessionId);
	}

}
