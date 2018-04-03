/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week9.djclassproject.data;

import edu.wctc.jrauch2.week9.djclassproject.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jmbra
 */
public class ProductDAO {
    
    public List<Product> getProducts() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Product> productList = null;
        
        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from name");
            rs = stmt.executeQuery();
            
            productList = new ArrayList<>();
            while (rs.next()) {
                
                String productID = rs.getString("id");
                String name = rs.getString("name");
                String shortDescription = rs.getString("shortDescription");
                String longDescription = rs.getString("longDescription");
                String image = rs.getString("image");
                double cost = rs.getDouble("cost");
                double retail = rs.getDouble("retail");
                int discount = rs.getInt("discount");
                int quantityOnHand = rs.getInt("quantityOnHand");
                int quantityOnOrder = rs.getInt("quantityOnOrder");
                boolean discontinued = rs.getBoolean("discontinued");
                boolean sale = rs.getBoolean("sale");
                
                Product product = new Product(productID, name, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale);
                                
                productList.add(product);
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
            
        } catch (SQLException sqlE) {
            sqlE.getErrorCode();
        }
        return productList;
    }
    
    
    
}