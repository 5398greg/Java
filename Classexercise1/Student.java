/*class to display details of student
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 4th February 2025
 */

package Classexercise1; // Define the package name

public class Student { // Declare the Student class
    public String name; // Declare a public string variable to store the student's name
    public Double marks; // Declare a public double variable to store the student's marks

    // Constructor for the Student class
    public Student(String name, Double marks) {
        this.name = name; // Initialize the name variable with the provided name
        this.marks = marks; // Initialize the marks variable with the provided marks
    }
    
    // Method to display the student's details
    public void displayDetails() {
        // Print the student's name and marks to the console
        System.out.println("Your name is " + name + "\nYour marks are " + marks);
    }
}
