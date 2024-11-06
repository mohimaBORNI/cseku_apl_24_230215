package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Signle Responsibity Princliple (SRP) attributes and behaviors 
//              shared by all products in the grocery system, ensuring consistent 
//              product management.
//***********************************************************************

/**
 * Abstract class representing the basic attributes and operations of a product.
 * All products share common properties like ID, name, price, and stock.
 */
public abstract class Product {
    protected String id, name; // unique identifier for the product and the name of the product
    protected double price; // Price of the product
    protected int stock; // Stock in the product

    /**
     * Constructs the product details
     * 
     * @param id
     * @param name
     * @param price
     * @param stock
     */
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Abstract method to retrieve the product ID
     * 
     * @return
     */
    public abstract String getId();

    /**
     * Abstract method to retrieve the product name
     * 
     * @return
     */
    public abstract String getName();

    /**
     * Abstract method to retrieve the product price
     * 
     * @return
     */
    public abstract double getPrice();

    /**
     * Abstract method to set the product price
     * 
     * @param price
     */
    public abstract void setPrice(double price);

    /**
     * Abstract method to retrieve the product's stock
     * 
     * @return
     */
    public abstract int getStock();

    /**
     * Abstract method to set the product stock level
     * 
     * @param stock
     */
    public abstract void setStock(int stock);

    /**
     * Abstract method to retrieve details of the product
     * 
     * @return
     */
    public abstract String getProductDetails();

}
