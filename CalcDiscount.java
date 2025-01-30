/*program to calculate discount
 * Author: Gregory Kimani
 * Reg No: CT101/G/19915/23
 * Date: 30th January 2025
 */

import java.util.Scanner;

public class CalcDiscount {

    public static void main(String[] args) {
        System.out.println("Enter Your Purchase: ");
        Scanner sc = new Scanner(System.in);
        double Purchase = sc.nextDouble();

        if(Purchase > 5000)
        {
            System.out.println("You have a 10% discount of " + (Purchase * 0.1) + " and the grand total is: " + (Purchase - (Purchase * 0.1)));
        }else if(Purchase >= 1000 && Purchase <= 5000)
        {
            System.out.println("You have a 5% discount of " + (Purchase * 0.05) + " and the grand total is: " + (Purchase - (Purchase * 0.05)));
        }else
        {
            System.out.println("You have no discount and the grand total is: " + Purchase);
        }

        sc.close();
    }
}
