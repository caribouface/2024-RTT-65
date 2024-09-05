package org.jonathonstephens.introductiontojavabasics;
/*
. Variables
. Declaration
. Assignments
. Data types
. Wrapper (helper classes) and objects
. Scanner (to get input from the console)
. Formatting
. Decision Structures
. Loops
. Arrays

1. Declare some variables - two integers - 1 to 100
2. The user needs to enter those integers
3. There should be a check to ensure that the entered numbers are from 1 to 100
4. The code should loop until the user enters a valid number from 1 to 100
5. Double variables - two
6. Some sort of calculation - addition, maybe
7. The doubles have to do with money - format the numbers in money format
8. Array of strings
9. We will do something to those strings
 */

import java.util.Scanner;

public class ReviewSeptember19 {
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
        boolean b1 = firstNumber >=1 && firstNumber <=100;
        boolean b2 = secondNumber >=1 && secondNumber <=100;


        // Decision statement that checks if the first number is from 1 to 100
        while (true) {
            if (b1) { //within range
                //They are correct - the number is valid
                System.out.println("The first number ( " + firstNumber + " ) is within the range 1-100.");
            } else {
                //They are incorrect - the number is invalid
                System.out.println("The first number is invalid, please retry.");
                // Ask again:
                System.out.print("Enter your number again, Range 1 - 100: ");
                firstNumber = input.nextInt();
            }
            //Decision statement that checks if the second number is from 1 to 100
            if (b2) {
                //They are correct - the number is valid
                System.out.println("The second number ( " + secondNumber + " ) is within the range 1-100.");
            } else {
                //They are incorrect - the number is invalid
                System.out.println("The second number is outside the range 1-100.");
                System.out.print("Enter your number again, Range 1 - 100: ");
                secondNumber = input.nextInt();
            } break;
        }
        double money = firstNumber + secondNumber;
        System.out.printf("The money is: %.2f", money);

        input.close();
    }

}
