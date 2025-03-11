/*program to show encapsulation
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 11th March 2025
 */

import java.util.Scanner; // Import the Scanner class for user input

class Car {
    private String licensePlate; // Private variable to store the car's license plate
    private boolean isRented; // Private variable to store the rental status of the car

    // Constructor to initialize the Car object with license plate and rental status
    public Car(String licensePlate, boolean isRented) {
        this.licensePlate = licensePlate;
        this.isRented = isRented;
    }

    // Method to rent the car
    public void rentCar() {
        if (isRented == false) { // Check if the car is not already rented
            isRented = true; // Set the rental status to true
            System.out.println("Car with license plate " + licensePlate + " rented successfully");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already rented");
        }
    }

    // Method to return the car
    public void returnCar() {
        if (isRented == true) { // Check if the car is currently rented
            isRented = false; // Set the rental status to false
            System.out.println("Car with license plate " + licensePlate + " returned successfully");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is not rented");
        }
    }

    // Getter method to check if the car is rented
    public boolean getIsRented() {
        return isRented; // Return the rental status
    }
}

public class encapsulationTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter the license plate of the car: "); // Prompt user for license plate
        String licensePlate = sc.nextLine(); // Read the license plate input

        System.out.println("Is the car rented? (true/false): "); // Prompt user for rental status
        boolean isRented = sc.nextBoolean(); // Read the rental status input

        Car Audi = new Car(licensePlate, isRented); // Create a new Car object with user input
        Audi.rentCar(); // Attempt to rent the car
        Audi.returnCar(); // Attempt to return the car

        boolean Rented = Audi.getIsRented(); // Check if the car is rented
        if (Rented == true) { // If the car is rented
            System.out.println("Car is rented");
        } else { // If the car is not rented
            System.out.println("Car is not rented");
        }

        sc.close(); // Close the Scanner object
    }
}
