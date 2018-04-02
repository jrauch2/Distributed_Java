package edu.wctc.jrauch2.week9.djclassproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart implements Serializable {
    private final Map<Product, Integer> contents;
    private int numberOfItemsInCart;
    private List<Product> keyList;
    private double subtotal;

    public Cart() {
        contents = new HashMap<>();
        keyList = new ArrayList<>(contents.keySet());
    }

    public Map<Product, Integer> getContents() {
            return contents;
    }

    public List<Product> getKeyList() {
        return keyList;
    }

    public int getNumberOfItemsInCart() {
        numberOfItemsInCart = 0;

        contents.entrySet().forEach((entry) -> {
            numberOfItemsInCart += entry.getValue();
        });
        return numberOfItemsInCart;
    }

    public void add(Product product) {
        if (product == null) {
            throw new NullPointerException();
        }
        Object productFound = contents.get(product);
        if (productFound == null) {
            contents.put(product, 1);
        }
        else {
            contents.put(product, contents.get(product) + 1);
        }
        updateKeyList();
    }
    
    public void updateProductQuantity(Product product, int quantity) {
        contents.put(product, quantity);
    }
    
    public void remove(Product product) {
            contents.remove(product);
    }

    public void removeAll() {
            contents.clear();
    }
    
    public double getSubtotal() {
        subtotal = 0;
        contents.entrySet().forEach((entry) -> {
            subtotal += entry.getKey().discountedRetail() * entry.getValue();
        });
        return subtotal;
    }
    
    private void updateKeyList() {
        keyList = new ArrayList<>(contents.keySet());
    }
}
