/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week10.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jmbra
 */
public class ShoppingCart implements Serializable{
    private final List<Name> contents = new ArrayList<>();

    public List<Name> getContents() {
        return contents;
    }
    
    public int getNumberOfItemsInCart() {
        return contents.size();
    }
    
    public void add(Name name) {
        contents.add(name);
    }
    
    public void remove(Name name) {
        contents.remove(name);
    }
    
    public void removeAll() {
        contents.clear();
    }
}
