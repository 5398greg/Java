/*program to calculate bonus
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 23rd January 2025
 */

import java.util.Scanner;

public class CalcBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int Salary = sc.nextInt();
        System.out.println("Enter your years of service: ");
        int YearsOfService = sc.nextInt();

        if(YearsOfService > 10)
        {
            System.out.println("Your salary of: " + Salary + "\nHas a 12% bonus of:  " + (Salary * 0.12) +"\nAnd the grand Total is: " + ((Salary * 0.12)+Salary) );
        }else if(YearsOfService >= 6 && YearsOfService <= 10)
        {
            System.out.println("Your salary of: " + Salary + "\nHas a 10% bonus of:  " + (Salary * 0.1) +"\nAnd the grand Total is: " + ((Salary * 0.1)+Salary) );
        }else
        {
            System.out.println("Your salary of: " + Salary + "\nHas a 12% bonus of:  " + (Salary * 0.12) +"\nAnd the grand Total is: " + ((Salary * 0.12)+Salary) );
        }

        sc.close();
    }
}