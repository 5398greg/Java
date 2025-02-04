/*class to store and display employee details
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 30th January 2025
 */

package Classexercise2; // Define the package name

public class Employee { // Declare the Employee class
    String name; // Declare a String variable to store the employee's name
    Double salary; // Declare a Double variable to store the employee's salary

    // Constructor to initialize the Employee object with name and salary
    public Employee(String name, Double salary) {
        this.name = name; // Assign the name parameter to the name variable
        this.salary = salary; // Assign the salary parameter to the salary variable
    }

    // Method to display the employee's details
    public void displayDetails() {
        // Print the employee's name and salary to the console
        System.out.println("Your name is: " + name + "\nYour Salary is: " + salary);
    }
}
