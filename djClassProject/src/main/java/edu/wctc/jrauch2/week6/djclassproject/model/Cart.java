package edu.wctc.jrauch2.week6.djclassproject.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable {
        private final Map<Product, Integer> contents;
        private int numberOfItemsInCart;
        
        public Cart() {
            contents = new HashMap<>();
        }

	public Map<Product, Integer> getContents() {
		return contents;
	}

	public int getNumberOfItemsInCart() {
            numberOfItemsInCart = 0;
            
            for (Map.Entry<Product, Integer> entry: contents.entrySet()) {
                numberOfItemsInCart += entry.getValue();
            }
            return numberOfItemsInCart;
	}

	public void add(Product product) {
            Object productFound = contents.get(product);
            if (productFound == null) {
                contents.put(product, 1);
            }
            else {
                contents.put(product, contents.get(product) + 1);
            }
	}

	public void remove(Product product) {
		contents.remove(product);
	}

	public void removeAll() {
		contents.clear();
	}

}
