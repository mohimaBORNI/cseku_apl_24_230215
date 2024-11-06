package Grocery_Shop_Management_System;

//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Structured classes, interface, and abstract class for a 
//              grocery system, demonstrating SOLID principles.
//***********************************************************************

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("C001", "Alice Smith", "alice@example.com");
        System.out.println(customer);
        // Create Products
        Product apple = new GroceryProduct("P001", "Apple", 1.5, 50);
        Product banana = new GroceryProduct("P002", "Banana", 0.9, 100);

        // Create a Cart and add products
        Cart cart = new Cart();
        cart.addProduct(apple);
        cart.addProduct(banana);

        // Calculate total
        double total = cart.calculateTotal();
        System.out.println("Total amount in cart: $" + total);

        // Create an Order
        Order order = new Order("Order for Apples and Bananas", new Date());
        order.placeOrder();

        // Online Payment process
        PaymentProcessor paymentProcessorOnline = new OnlinePayment();
        paymentProcessorOnline.processPayment(total);
        paymentProcessorOnline.processTips(0);

        // Offline payment process
        PaymentProcessor paymentProcessorOffline = new OfflinePayment();
        paymentProcessorOffline.processPayment(total);
        paymentProcessorOffline.processTips(0);

        // Output order details
        System.out.println("Order placed: " + order.getOrderDetails());
        System.out.println("Payment processed for amount: $" + total);

    }
}
