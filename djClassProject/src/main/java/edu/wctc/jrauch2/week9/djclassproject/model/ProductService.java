package edu.wctc.jrauch2.week9.djclassproject.model;

import edu.wctc.jrauch2.week9.djclassproject.data.ProductDAO;
import java.util.List;

public class ProductService {
    
    public Product getProduct(String productID) {
        Product matchedProduct = null;
        List<Product> productList = getProductList(); 
        for (Product product : productList) {
            if (product.getProductID().equals(productID)) {
                matchedProduct = product;
            }
        }
        return matchedProduct;
    }

    public List<Product> getProductList() {
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.getProducts();
        
        return productList;
    }
}
