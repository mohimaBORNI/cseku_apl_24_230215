package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Dependency Inversion Principle (DIP) for handling 
//              offline payments and tips for staff.
//***********************************************************************

/**
 * Class implementing the PaymentProcessor interface for processing payments.
 */
public class OfflinePayment implements PaymentProcessor {

    /**
     * processes a Cash or online method : credit card, bkash rocket or Cash payment
     * 
     * @params amount : The amount need to be proceed
     */
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment done by offline");
    }

    /**
     * Processes a tips for staff
     * 
     * @params amount: given to staff
     */
    @Override
    public void processTips(double amount) {
        System.out.println("Tips is given to staff");
    }

}
