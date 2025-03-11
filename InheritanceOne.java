/*program to show inheritance
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 13rd February 2025
 */

public class InheritanceOne {

    // Define a base class BankAccount
    public class BankAccount {
        protected double balance; // Protected variable to store the balance

        // Constructor to initialize the balance
        public BankAccount(double balance) {
            this.balance = balance;
        }

        // Method to deposit an amount to the balance
        public void Deposit(double amount) {
            balance += amount;
        }

        // Method to withdraw an amount from the balance
        public void Withdraw(double amount) {
            balance -= amount;
        }
    }

    // Define a subclass SavingsAccount that extends BankAccount
    public class SavingsAccount extends BankAccount {

        // Constructor to initialize the balance
        public SavingsAccount(double balance) {
            super(balance); // Call the constructor of the superclass
        }

        // Override the Withdraw method to ensure balance doesn't go below 100
        @Override
        public void Withdraw(double amount) {
            if (balance - amount >= 100)
                balance -= amount;
        }
    }

    // Define a subclass CheckingAccount that extends BankAccount
    public class CheckingAccount extends BankAccount {

        // Constructor to initialize the balance
        public CheckingAccount(double balance) {
            super(balance); // Call the constructor of the superclass
        }

        // Override the Withdraw method to add a fee of 1 unit
        @Override
        public void Withdraw(double amount) {
            balance -= (amount + 1);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {

        InheritanceOne inheritanceOne = new InheritanceOne(); // Create an instance of InheritanceOne
        BankAccount ba = inheritanceOne.new BankAccount(300); // Create a new BankAccount with a balance of 300

        ba.Deposit(30); // Deposit 30 units to the balance

        // Print the current balance
        System.out.println(ba.balance);

        ba.Withdraw(100); // Withdraw 100 units from the balance

        // Print the current balance
        System.out.println(ba.balance);

        SavingsAccount sa = inheritanceOne.new SavingsAccount(ba.balance); // Create a new SavingsAccount with the current balance

        sa.Withdraw(100); // Withdraw 100 units from the SavingsAccount
        ba = sa; // Assign the SavingsAccount to the BankAccount reference

        // Print the current balance
        System.out.println(ba.balance);

        CheckingAccount ca = inheritanceOne.new CheckingAccount(ba.balance); // Create a new CheckingAccount with the current balance

        ca.Withdraw(100); // Withdraw 100 units from the CheckingAccount
        ba = ca; // Assign the CheckingAccount to the BankAccount reference

        // Print the current balance
        System.out.println(ba.balance);

    }
}