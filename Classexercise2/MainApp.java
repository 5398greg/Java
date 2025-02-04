/*program to Calculate bonus of employee
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 4th February 2025
 */

package Classexercise2; // Define the package name

import java.util.Scanner; // Import the Scanner class for user input

public class MainApp { // Define the MainApp class
    public static void main(String[] args) { // Main method
        String name; // Declare a variable to store the employee's name
        double salary; // Declare a variable to store the employee's salary
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("What is your name: "); // Prompt the user to enter their name
        name = sc.nextLine(); // Read the user's name

        System.out.println("whats your salary: "); // Prompt the user to enter their salary
        salary = sc.nextDouble(); // Read the user's salary

        Employee employee = new Employee(name, salary); // Create an Employee object with the user's name and salary

        SalaryCalculator emp = new SalaryCalculator(); // Create a SalaryCalculator object
        double bonus = emp.calculateBonus(employee.salary); // Calculate the bonus for the employee

        employee.displayDetails(); // Display the employee's details
        System.out.println("You have a bonus of: " + bonus); // Display the calculated bonus

        sc.close(); // Close the Scanner object
    }
}
