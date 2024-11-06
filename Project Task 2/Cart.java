package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Single Responsibility Principle (SRP) for managing a shopping cart
//              by allowing products to be added, removed, and cleared, 
//              and calculates the total cost of items.
//***********************************************************************
import java.util.List;

/**
 * Class representing a shopping cart to manage a collection of products.
 * It allows adding, removing products, and calculating the total cost.
 */
public class Cart {

    @SuppressWarnings("unused")
    private List<Product> products; // list of products in the cart

    /**
     * Constructs the empty cart for shopping
     */
    public Cart() {
        this.products = null;
    }

    /**
     * Method to adds a product to the cart
     * 
     * @param product
     */
    public void addProduct(Product product) {
    }

    /**
     * Method to removes a product from the cart
     * 
     * @param product
     */
    public void removeProduct(Product product) {
    }

    /**
     * Method to calculates the total cost of products in the cart
     * 
     * @return
     */
    public double calculateTotal() {
        return 0.0;
    }

    /**
     * Method to retrieves the list of products in the cart
     * 
     * @return
     */
    public List<Product> getProducts() {
        return null;
    }

    /**
     * Method to clears all products from the cart
     */
    public void clearCart() {
    }

}
