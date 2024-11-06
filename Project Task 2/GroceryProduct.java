package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Liskov Substitution Principle (LSP) for specific grocery products, extending
//              the general Product class to provide detailed information for grocery items
//***********************************************************************

/**
 * Represents the gerocery products extended from product
 */
public class GroceryProduct extends Product {

    public GroceryProduct(String id, String name, double price, int stock) {
        super(id, name, price, stock);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getId() {
        return super.id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }

    @Override
    public int getStock() {
        return super.stock;
    }

    @Override
    public void setStock(int stock) {
        super.stock = stock;
    }

    @Override
    public String getProductDetails() {
        return getName() + " - $" + getPrice();
    }

}
