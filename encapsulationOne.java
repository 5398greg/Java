/*program to show encapsulation
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 11th March 2025
 */

import java.util.Scanner; // Import the Scanner class for user input

// Define the BankAccount class
class BankAccount {
    private double balance; // Private variable to store the balance

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount to the balance
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw an amount from the balance
    public void widthdraw(double amount) {
        // Check if the amount is greater than the balance, less than 0, or if the balance is 0
        if (amount > balance || amount < 0 || balance == 0) {
            System.out.println("Insuficient Balance"); // Print insufficient balance message
            return; // Exit the method
        }
        balance -= amount; // Subtract the amount from the balance
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Define the main class
public class encapsulationOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter your account balance: "); // Prompt user to enter account balance
        BankAccount Person = new BankAccount(sc.nextDouble()); // Create a new BankAccount object with the entered balance

        System.out.println("Enter amount to deposit: "); // Prompt user to enter amount to deposit
        Person.deposit(sc.nextDouble()); // Deposit the entered amount
        System.out.println("Your new balance is: " + Person.getBalance()); // Print the new balance

        System.out.println("Enter amount to withdraw: "); // Prompt user to enter amount to withdraw
        Person.widthdraw(sc.nextDouble()); // Withdraw the entered amount
        System.out.println("Your balance is: " + Person.getBalance()); // Print the balance after withdrawal

        sc.close(); // Close the Scanner object
    }
}
