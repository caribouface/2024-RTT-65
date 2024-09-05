package org.jonathonstephens.introductiontojavabasics;
/*
Write a program that lest the user enter a decimal dollars and cents,
and outputs the monetary equivalent in single dollars, quarters, dimes,
nickles, and pennies.

For example:
Input:   3.87
Output: 3 dollars
        3 quarters
        1 dime
        0 nickles
        2 pennies
 */
import java.util.Scanner;
public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Get input from the user
        System.out.print("Enter the amount in decimal dollars and cents: ");
        double amount = scanner.nextDouble();

        // Extract the whole dollar amount
        int dollars = (int) amount;

        // Calculate the remaining cents
        int cents = (int) ((amount - dollars) * 100);

        // Calculate the number of quarters, dimes, nickels, and pennies
        double quarters = cents / 25;
        cents = cents % 25;
        double dimes = cents / 10;
        cents = cents % 10;
        double nickels = cents / 5;
        double pennies = cents;

        // Print the output
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");


        scanner.close();



    }
}
