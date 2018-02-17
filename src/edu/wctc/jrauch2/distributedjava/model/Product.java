package edu.wctc.jrauch2.distributedjava.model;

public class Product {
    private int itemNumber;
    private String name;
    private String shortDescription;
    private String longDescription;
    private String[] images;
    private double cost;
    private double retail;
    private int discount;
    private int quantityOnHand;
    private int quantityOnOrder;
    private boolean discontinued;
    private boolean sale;

    /**
     * Constructor including all parameters.
     * @param itemNumber The item number of the product.
     * @param name The name of the product.
     * @param shortDescription A short description of the product for the "Product" page.
     * @param longDescription A long description of the product for the "Product Details" page.
     * @param images A String array containing urls of images for the product.
     * @param cost The cost of the product to the retailer, including packaging and labor, not including retail markup.
     * @param retail The retail price of the product, cost + markup.
     * @param discount The discount on the product as an integer, between 0 and 100.
     * @param quantityOnHand The quantity retailer has on hand.
     * @param quantityOnOrder The quantity the retailer has on order.
     * @param discontinued Is the product discontinued?
     * @param sale Is the product on sale?
     */
    public Product(int itemNumber, String name, String shortDescription, String longDescription, String[] images, double cost, double retail, int discount, int quantityOnHand, int quantityOnOrder, boolean discontinued, boolean sale) throws Exception{
        setItemNumber(itemNumber);
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.images = images;
        this.cost = cost;
        this.retail = retail;
        setDiscount(discount);
        this.quantityOnHand = quantityOnHand;
        this.quantityOnOrder = quantityOnOrder;
        this.discontinued = discontinued;
        this.sale = sale;
    }

    /**
     * Constructor including minimum parameter of "itemNumber", "name", "cost", and "retail". The remaining parameters are set to default values to avoid null values.
     * @param itemNumber The item number of the product.
     * @param name The name of the product.
     * @param cost The cost of the product to the retailer, including packaging and labor, not including retail markup.
     * @param retail The retail price of the product, cost + markup.
     */
    public Product(int itemNumber, String name, double cost, double retail) throws Exception {
        setItemNumber(itemNumber);
        this.name = name;
        this.cost = cost;
        this.retail = retail;
        discount = 0;
        shortDescription = "";
        longDescription = "";
        images = new String[]{""};
        quantityOnHand = 0;
        quantityOnOrder = 0;
        discontinued = false;
        sale = false;
    }

    /**
     * Getter for "itemNumber".
     * @return the item number of the product.
     */
    public int getItemNumber() {
        return itemNumber;
    }

    /**
     * Private setter for "itemNumber" for the constructor to verify that the item number is valid.
     * @param itemNumber The item number of the product.
     */
    private void setItemNumber(int itemNumber) throws Exception{
        if (itemNumber > 0) {
            this.itemNumber = itemNumber;
        } else {
            throw new Exception("Invalid item number");
        }
    }

    /**
     * Getter for "name".
     * @return the name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the product.
     * @param name The name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for "shortDescription".
     * @return the short description for the product to be displayed on the main product page.
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Setter for "shortDescription".
     * @param shortDescription The short description for the product to be displayed on the main product page.
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * Getter for "longDescription".
     * @return the long description for the product to be displayed of the product details page.
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Setter for "longDescription".
     * @param longDescription the long description for the product to be displayed of the product details page.
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * Getter for "images".
     * @return a string array containing the location of images for the product.
     */
    public String[] getImages() {
        return images;
    }

    /**
     * Setter for "images".
     * @param images A string array containing the location of images for the product.
     */
    public void setImages(String[] images) {
        this.images = images;
    }

    /**
     * Getter for "cost".
     * @return the cost of the product. Cost should include the total cost of the product, i.e. - how much the retailer paid for the product, plus the cost of any packaging and storage of the product that the retailer incurred.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Setter for "cost".
     * @param cost The cost of the product. Cost should include the total cost of the product, i.e. - how much the retailer paid for the product, plus the cost of any packaging and storage of the product that the retailer incurred.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Getter for "retail".
     * @return the price at which the product is being sold.
     */
    public double getRetail() {
        return retail;
    }

    /**
     * Setter for "retail".
     * @param retail The price at which the product is being sold.
     */
    public void setRetail(double retail) {
        this.retail = retail;
    }

    /**
     * Getter for "discount".
     * @return the discount to apply to the product, whether that be from a coupon, vendor discount, volume discount, or sale.
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * Setter for "discount".
     * @param discount The discount to apply to the product, whether that be from a coupon, vendor discount, volume discount, or sale.
     */
    public void setDiscount(int discount) throws Exception {
        if (discount >= 0 || discount <= 100) {
            this.discount = discount;
        } else {
            throw new Exception("\"discount\" out of bounds. Must be between \'0\" and\"100\"");
        }
    }

    /**
     * Getter for "quantityOnHand".
     * @return the number of units of the product that the retailer has on hand.
     */
    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Setter for "quantityOnHand".
     * @param quantityOnHand The number of units of the product that the retailer has on hand.
     */
    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    /**
     * Getter for "quantityOnOrder".
     * @return the number of units of the product that the retailer has ordered and expects to receive.
     */
    public int getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * Setter for "quantityOnOrder".
     * @param quantityOnOrder The number of units of the product that the retailer has ordered and expects to receive.
     */
    public void setQuantityOnOrder(int quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }

    /**
     * Getter for "discontinued".
     * @return true if the product is discontinued, else, false.
     */
    public boolean isDiscontinued() {
        return discontinued;
    }

    /**
     * Setter for "discontinued".
     * @param discontinued True if the product is discontinued, else, false.
     */
    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    /**
     * Getter for "sale".
     * @return true if the product is on sale, else, false.
     */
    public boolean isSale() {
        return sale;
    }

    /**
     * Setter for "sale".
     * @param sale true if the product is on  sale, else, false.
     */
    public void setSale(boolean sale) {
        this.sale = sale;
    }

    /**
     * Calculate the retail price of the product after applying the discount.
     * @return the the price of the product after the discount is applied.
     */
    public double discountedRetail() {
        return (retail - (retail * (discount / 100)));
    }
}
