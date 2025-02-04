/*program to calculate grade of student
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 4th February 2025
 */

package Classexercise1; // Define the package name

import java.util.Scanner; // Import the Scanner class for user input

public class Mainapp { // Define the Mainapp class
    public static void main(String [] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Whats Your name: "); // Prompt user for their name
        String name = sc.nextLine(); // Read the user's name

        System.out.println("What are your marks: "); // Prompt user for their marks
        double marks = sc.nextDouble(); // Read the user's marks
        Student std = new Student(name, marks); // Create a Student object with the user's name and marks

        GradeCalculator stdudent; // Declare a GradeCalculator object
        stdudent = new GradeCalculator(); // Initialize the GradeCalculator object

        std.displayDetails(); // Display the student's details
        System.out.println("Your Grade is " + stdudent.calculateGrade(marks) ); // Calculate and display the student's grade

        sc.close(); // Close the Scanner object
    }
}
