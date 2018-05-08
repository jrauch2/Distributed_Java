/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jrauch2.djclassprojectspringboot.rest;

import edu.wctc.jrauch2.djclassprojectspringboot.model.Product;
import edu.wctc.jrauch2.djclassprojectspringboot.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joshua Rauch
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @RequestMapping(method = GET, path = "/product")
    public List<Product> getProducts() throws Exception {
        return productService.getProductList();
    }
    
    @RequestMapping(method = GET, path = "/product/{id}")
    public Product getProduct(@PathVariable String id) {
        Product product = productService.getProduct(id);
        return product;
    }
    
//    @RequestMapping(method = POST, path= "/product")
//    public void createName(@RequestBody Product product) {
//        productService.createProduct(product);
//    }
}
