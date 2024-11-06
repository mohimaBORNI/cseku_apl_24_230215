package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Interface Segregation Principle (ISP) for a contract for processing payments and tips, 
//              providing flexibility for different payment methods.
//***********************************************************************

/**
 * Interface defining payment processing capabilities for various payment
 * methods.
 */
public interface PaymentProcessor {
    /**
     * 
     * @param amount
     */
    void processPayment(double amount);

    /**
     * processess a amount for the staff or delivery man
     * 
     * @param amount
     */
    void processTips(double amount);
}
