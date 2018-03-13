/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.week6.djclassproject.bean;

import edu.wctc.jrauch2.week6.djclassproject.model.ProductService;
import edu.wctc.jrauch2.week6.djclassproject.model.Product;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author jrauch2
 */
@Named(value = "productBean")
@SessionScoped
public class ProductBean implements Serializable {
    
    private final ProductService PRODUCT_SERVICE = new ProductService();
    
    public ProductBean() {
    }

    public ProductService getPRODUCT_SERVICE() {
        return PRODUCT_SERVICE;
    }

    public List<Product> getProductList() {
        return PRODUCT_SERVICE.getProductList();
    }
    
    public Product getProduct(String productID){
        Product product = null;
        for (Product p : PRODUCT_SERVICE.getProductList()) {
            if (productID.equals(p.getProductID())) {
                product = p;
            }
        }
        if (product != null) {
            return product;
        } else {
            throw new IllegalArgumentException("Product not found");
        }
    }

    public void productDetail(AjaxBehaviorEvent event) {
        try {
            String productID = (String) event.getComponent().getAttributes().get("productID");
            
            FacesContext.getCurrentInstance().getExternalContext().redirect("productDetails.xhtml?id=" + productID);
        } catch (IOException ex) {
            Logger.getLogger(ProductBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
