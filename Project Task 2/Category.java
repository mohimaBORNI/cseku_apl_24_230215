package Grocery_Shop_Management_System;

//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Single Responsibility Principle (SRP) for manages groups of products by category, allowing easy 
//              retrieval and display of category-specific information.
//***********************************************************************
import java.util.List;

/**
 * Class for grouping products by category and managing them accordingly.
 * Each category has a unique ID, name, and a collection of products.
 */
public class Category {
    @SuppressWarnings("unused")
    private String id, name; // Name and ID of the category
    @SuppressWarnings("unused")
    private List<Product> products;

    /**
     * Constructs the details of the category with the product list
     * 
     * @param id
     * @param name
     * @param products
     */
    public Category(String id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    /**
     * Method to retrieves the category ID
     * 
     * @return
     */
    public String getId() {
        return "";
    }

    /**
     * Method to retrieves the category name
     * 
     * @return
     */
    public String getName() {
        return "";
    }

    /**
     * Method to retrieves the list of products in this category
     * 
     * @return
     */
    public List<Product> getProducts() {
        return null;
    }

    /**
     * Displays all products in this category
     */
    public void displayProducts() {
    }

}
