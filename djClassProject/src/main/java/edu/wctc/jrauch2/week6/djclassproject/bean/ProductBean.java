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
import javax.faces.application.FacesMessage;
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

    public List<Product> getProductList() {
        return PRODUCT_SERVICE.getProductList();
    }

//    public void productDetails(AjaxBehaviorEvent event) {
//        try {
//            FacesContext.getCurrentInstance().getExternalContext().redirect("productDetails.xhtml?id=" + product.getProductID());
//        } catch (IOException ex) {
//            FacesMessage msg = new FacesMessage("IOException", product.getProductID());
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//    }
}
