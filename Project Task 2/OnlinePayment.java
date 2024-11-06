package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Dependency Inversion Principle (DIP) for handling online 
//              payments and tips for delivery staff.
//***********************************************************************

/**
 * Class implementing the PaymentProcessor interface for processing online
 * payments.
 */
public class OnlinePayment implements PaymentProcessor {

    /**
     * processes a online payment like: credit card, bkash rocket or Cash On
     * Delivery
     * 
     * @params amount : The amount need to be proceed
     */
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment done by online");
    }

    /**
     * Processes a tips for delivery man
     * 
     * @params amount: given to the delivery man
     */
    @Override
    public void processTips(double amount) {
        System.out.println("Tips is given to delivary man");
    }

}
