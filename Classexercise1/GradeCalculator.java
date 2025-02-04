/*Class to calculate Grade
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 4th February 2025
 */

package Classexercise1; // Define the package name

public class GradeCalculator { // Define the GradeCalculator class
    public String calculateGrade(double marks) // Method to calculate grade based on marks
    {
        // Declare a variable to store the grade
        String grade;
        
        // Check if marks are between 90 and 100
        if (marks >= 90 && marks <= 100) {
            grade = "A"; // Assign grade A
        } else if (marks >= 75 && marks < 90) { // Check if marks are between 75 and 89
            grade = "B"; // Assign grade B
        } else if (marks >= 50 && marks < 75) { // Check if marks are between 50 and 74
            grade = "C"; // Assign grade C
        } else if (marks >= 0 && marks < 50) { // Check if marks are between 0 and 49
            grade = "D"; // Assign grade D
        } else { // If marks are not within the valid range
            grade = "Invalid"; // Assign grade Invalid
        }

        return grade; // Return the calculated grade
    }	
}
