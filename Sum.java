/*program to add two numbers
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 23rd January 2025
 */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
        sc.close();
    }   
}
