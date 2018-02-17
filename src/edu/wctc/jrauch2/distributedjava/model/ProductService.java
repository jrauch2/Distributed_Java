package edu.wctc.jrauch2.distributedjava.model;

import edu.wctc.jrauch2.distributedjava.FileIO.FileInput;

import java.util.ArrayList;

public class ProductService {
    private FileInput productList = new FileInput("productList.csv");
    private String line;
    private String[] product;
    private String[] image;
    private ArrayList<Product> products = new ArrayList<>();

    public ProductService() {
        while ((line = productList.fileReadLine()) != null) {
            product = line.split(",");
            image = product[4].split("|");
            try {
                products.add(new Product(Integer.parseInt(product[0]), product[1], product[2], product[3], image, Double.parseDouble(product[5]), Double.parseDouble(product[6]), Integer.parseInt(product[7]), Integer.parseInt(product[8]), Integer.parseInt(product[9]), Boolean.parseBoolean(product[10]), Boolean.parseBoolean(product[11])));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
