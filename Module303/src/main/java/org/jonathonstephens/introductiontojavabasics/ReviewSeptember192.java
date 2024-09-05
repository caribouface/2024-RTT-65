package org.jonathonstephens.introductiontojavabasics;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewSeptember192 {
    public static void main(String[] args) {
        // We need two variables DECLARED - two integer variables:
        int firstNumber;
        int secondNumber;
        // Declare a Scanner object:
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number:
        System.out.print("Enter first number: ");
        // Take the input from the console:
        firstNumber = input.nextInt();

        // Ask the user for the second number:
        System.out.print("Enter second number: ");
        // Take the input from the console:
        secondNumber = input.nextInt();

        // Decision statement that checks if the first number is from 1 to 100
        while (true) {
            boolean b1 = firstNumber >= 1 && firstNumber <= 100;
            if (b1) {
                System.out.println("The first number ( " + firstNumber + " ) is within the range 1-100.");
            } else {
                System.out.println("The first number is invalid, please retry.");
                System.out.print("Enter your number again, Range 1 - 100: ");
                firstNumber = input.nextInt();
                continue;
            }

            boolean b2 = secondNumber >= 1 && secondNumber <= 100;
            if (b2) {
                System.out.println("The second number ( " + secondNumber + " ) is within the range 1-100.");
            } else {
                System.out.println("The second number is outside the range 1-100.");
                System.out.print("Enter your number again, Range 1 - 100: ");
                secondNumber = input.nextInt();
                continue;
            }
            break;
        }

        double money = firstNumber + secondNumber;
        System.out.printf("Total: $%.2f\n", money);

        String[] groupMembers = {"Yu Chen", "Hanna", "Takeisha", "Zurika", "Jonathon", "Matt"};
        System.out.println("\nThis program created by: " + Arrays.toString(groupMembers));


    }
}