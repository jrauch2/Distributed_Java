package edu.wctc.jrauch2.distributedjava.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {
    private ProductService productService;
    private Product product;

    @Before
    public void setUp() throws Exception {
        productService = new ProductService();
        product = productService.getProduct("100001");
    }

    @Test
    public void getProduct() {

        assertEquals("100001",product.getProductID());
    }

    @Test
    public void getProductList() {
    }
}