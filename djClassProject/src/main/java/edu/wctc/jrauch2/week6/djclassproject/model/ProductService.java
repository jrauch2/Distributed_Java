package edu.wctc.jrauch2.week6.djclassproject.model;

import edu.wctc.jrauch2.week6.djclassproject.FileIO.FileInput;
import java.io.File;

import java.util.ArrayList;

public class ProductService {
    private FileInput products = new FileInput(new File("D:/OneDrive - Waukesha County Technical College/Spring 2018/Distributed Java/Distributed_Java/djClassProject", "productList.csv"));
//    private FileInput products;
    private String line;
    private String[] productAsArray;
    private ArrayList<Product> productList = new ArrayList<>();

    public ProductService() {
//        products = new FileInput(ProductService.class.getClassLoader().getResourceAsStream("productList.csv"));
        while ((line = products.fileReadLine()) != null) {
            productAsArray = line.split("\\|");
            try {
                productList.add(new Product(productAsArray[0], productAsArray[1], productAsArray[2], productAsArray[3], productAsArray[4], Double.parseDouble(productAsArray[5]), Double.parseDouble(productAsArray[6]), Integer.parseInt(productAsArray[7]), Integer.parseInt(productAsArray[8]), Integer.parseInt(productAsArray[9]), Boolean.parseBoolean(productAsArray[10]), Boolean.parseBoolean(productAsArray[11])));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        products.fileClose();
    }

    public Product getProduct(String productID) {
        Product matchedProduct = null;
        for (Product product : productList) {
            if (product.getProductID().equals(productID)) {
                matchedProduct = product;
            }
        }
        if (matchedProduct != null) {
            return matchedProduct;
        } else {
            throw new IllegalArgumentException("Invalid productID. Product not found.");
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
