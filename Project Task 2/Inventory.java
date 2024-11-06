package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Single Responsibility Principle (SRP) for manageing stock levels for products, 
//              including updates, checks, and displaying the inventory
//***********************************************************************

/**
 * Class responsible for managing product inventory, including stock updates and
 * checks.
 */
public class Inventory {
    /**
     * Showing stock levels of a specific product
     * 
     * @param productId Id of the specific product
     * @param quantity  Quantity of the specific product
     */
    public void updateStock(String productId, int quantity) {
        // updating stocks
    }

    /**
     * Checking Stocks of a specific products
     * 
     * @param productId The ID of the product to check
     * @return no of stocks left
     */
    public int checkStock(String productId) {
        return 0;
    }

    /**
     * Displaying the entire inventory of products.
     */
    public void displayInventory() {
        System.out.println("Here all the products are available");
    }
}
