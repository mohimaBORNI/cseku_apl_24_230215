package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Single Responsibility Principle (SRP) for representing 
//              a customer, providing attributes and methods 
//              to manage their identity and interactions with their shopping cart.
//***********************************************************************

/**
 * Class representing a customer with cart management capabilities.
 * Each customer has a unique ID, name, and email and can manage products in
 * their cart.
 */
class Customer {
    @SuppressWarnings("unused")
    private String id, name, email; // Customer's id, name and email

    /**
     * Constructs a customer's details
     * 
     * @param id
     * @param name
     * @param email
     */
    Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Method to retrieves the customer ID
     * 
     * @return
     */
    public String getId() {
        return "";
    }

    /**
     * Method to retrieves the customer name
     * 
     * @return
     */
    public String getName() {
        return "";
    }

    /**
     * Method to retrieves the customer email
     * 
     * @return
     */
    public String getEmail() {
        return "";
    }

    /**
     * Mehtod to adds a product to the customer's cart
     * 
     * @param product
     */
    public void addToCart(Product product) {
        // add the product to the customers cart
    }

    /**
     * Method to removes a product from the customer's cart
     * 
     * @param product
     */
    public void removeFromCart(Product product) {
        // remove the product to the customers cart
    }

    public String toString() {
        return "ID: " + this.id + "\nName: " + this.name + "\nEmail: " + this.email;
    }
}
