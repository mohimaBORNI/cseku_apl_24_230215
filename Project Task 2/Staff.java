package Grocery_Shop_Management_System;
//***********************************************************************

// Title  : Grocery System Class Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
// Descrition : Single Responsibility Principle (SRP) for details and responsibilities of a staff 
//              member within the grocery system, such as their ID, position, and salary.
//***********************************************************************

/**
 * Class representing a staff member with details like position and salary.
 * The staff can manage various administrative tasks within the grocery system.
 */
public class Staff {
    @SuppressWarnings("unused")
    private String id, position; // Id and Position of the staff
    @SuppressWarnings("unused")
    private double salary; // salary of the staff

    /**
     * constructs the stuff details
     * 
     * @param id
     * @param position
     * @param salary
     */
    public Staff(String id, String position, double salary) {
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    /**
     * Method to retrieves the staff member's ID
     * 
     * @return
     */
    public String getId() {
        return "";
    }

    /**
     * Method to retrieves the staff member's position
     * 
     * @return
     */
    public String getPosition() {
        return "";
    }

    /**
     * Method to retrieves the staff member's salary
     * 
     * @return
     */
    public double getSalary() {
        return 0.0;
    }

    /**
     * Method to sets the staff member's position
     * 
     * @param position
     */
    public void setPosition(String position) {
    }

    /**
     * Method to sets the staff member's salary
     * 
     * @param salary
     */
    public void setSalary(double salary) {
    }

    /**
     * Method to retrieves details about the staff member
     * 
     * @return
     */
    public String getStaffDetails() {
        return "";
    }
}
