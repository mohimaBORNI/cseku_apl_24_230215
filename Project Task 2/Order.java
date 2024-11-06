package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Single Responsibility Principle (SRP) for representing an order in  
//              the grocery system,encapsulating order details 
//              and the functionality to place an order.
//***********************************************************************
import java.util.Date;

/**
 * Class representing an order with details and the capability to place the
 * order.
 * Each order includes information such as date and order details.
 */
public class Order {
    @SuppressWarnings("unused")
    private String orderDetails;
    @SuppressWarnings("unused")
    private Date orderDate;

    /**
     * Constructs the orders initail details and date
     * 
     * @param orderDetails
     * @param orderDate
     */
    public Order(String orderDetails, Date orderDate) {
        this.orderDetails = orderDetails;
        this.orderDate = orderDate;
    }

    /**
     * Method to place order
     */
    public void placeOrder() {
        // Helps to place order
    }

    /**
     * Method to retrieves the order
     * 
     * @return
     */
    public String getOrderDetails() {
        return "";
    }

    /**
     * Method to retrieves the date of the order
     * 
     * @return
     */
    public Date getDate() {
        return new Date();
    }
}
