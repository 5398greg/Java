/*program to deal with Car details
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 14th February 2025
 */
import java.util.Scanner; // Import the Scanner class for user input

// Define a class named Vehicle
class Vehicle {
    // Declare protected variables for brand, model, and year
    protected String brand;
    protected String model;
    protected int year;

    // Constructor for the Vehicle class
    public Vehicle(String brand, String model, int year) {
        this.brand = brand; // Initialize brand
        this.model = model; // Initialize model
        this.year = year; // Initialize year
    }

    // Method to display details of the vehicle
    public void displayDetails() {
        System.out.println("The brand of the Vehicle is: " + brand); // Print brand
        System.out.println("The model of the vehicle is: " + model); // Print model
        System.out.println("The year of manufacture is: " + year); // Print year
    }
}

// Define a class named Car that extends Vehicle
class Car extends Vehicle {
    // Declare a protected variable for fuel type
    protected String fuelType;

    // Constructor for the Car class
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call the constructor of the superclass (Vehicle)
        this.fuelType = fuelType; // Initialize fuel type
    }

    // Override the displayDetails method to include fuel type
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the superclass
        System.out.println("The fuel type of the car is: " + fuelType); // Print fuel type
    }
}

// Define the main class Showroom
public class Showroom {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the brand of the car
        System.out.println("Enter the Brand of the car: ");
        String brand = sc.nextLine(); // Read the brand input

        // Prompt the user to enter the model of the car
        System.out.println("Enter the model of the car: ");
        String model = sc.nextLine(); // Read the model input

        // Prompt the user to enter the year of manufacture for the car
        System.out.println("Enter year of manufacture for the car: ");
        int year = sc.nextInt(); // Read the year input
        sc.nextLine(); // Consume the newline character

        // Prompt the user to enter the fuel type of the car
        System.out.println("Enter the fuel type of the car: ");
        String fuelType = sc.nextLine(); // Read the fuel type input

        // Create a new Car object with the provided inputs
        Car car = new Car(brand, model, year, fuelType);

        // Display the details of the car
        car.displayDetails();

        // Close the Scanner object
        sc.close();
    }
}
