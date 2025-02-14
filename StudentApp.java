/*program to deal with student records
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 14th February 2025
 */
import java.util.Scanner; // Import the Scanner class for user input

// Define a class to represent a student record
class StudentRecord {
    protected int studentID; // Protected variable to store student ID
    protected String name; // Protected variable to store student name
    protected String course; // Protected variable to store student course

    // Constructor to initialize the student record
    public StudentRecord(int studentID, String name, String course) {
        this.studentID = studentID; // Assign the student ID
        this.name = name; // Assign the student name
        this.course = course; // Assign the student course
    }

    // Method to display the student information
    public void displayInfo() {
        System.out.println("The Student ID is: " + studentID); // Print the student ID
        System.out.println("The student name is: " + name); // Print the student name
        System.out.println("The student course is: " + course); // Print the student course
    }
}

// Main class to run the student application
public class StudentApp {

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter the Student ID: "); // Prompt user to enter student ID
        int StudentID = sc.nextInt(); // Read the student ID
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the Student Name: "); // Prompt user to enter student name
        String StudentName = sc.nextLine(); // Read the student name

        System.out.println("Enter the Student Course: "); // Prompt user to enter student course
        String StudentCourse = sc.nextLine(); // Read the student course

        // Create a new StudentRecord object with the provided details
        StudentRecord Student = new StudentRecord(StudentID, StudentName, StudentCourse);

        Student.displayInfo(); // Display the student information
        
        sc.close(); // Close the Scanner object
    }
}
