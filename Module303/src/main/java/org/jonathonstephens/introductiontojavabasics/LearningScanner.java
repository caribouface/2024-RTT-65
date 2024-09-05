package org.jonathonstephens.introductiontojavabasics;

import java.util.Scanner; //We need permission to use Scanner so we import

public class LearningScanner {
    public static void main(String[] args) {
     //Scanner - allows us to get values from the console
        //System.in - System out
        Scanner scanner = new Scanner(System.in);//object of TYPE Scanner
        System.out.println("Please enter the name of the file: ");
        String name = scanner.nextLine();

        //Calculator: get the two numbers from the user:
        //Ask the user for the first number:
        System.out.println("Please enter the first number: ");
        int number1 = scanner.nextInt(); //nextInt is a method that takes ints

        //Ask the user for the second number
        System.out.println("Please enter the second number: ");
        //we use the scanner to GRAB that number from the console
        int number2 = scanner.nextInt();

        //Calculations:
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        //modulus - remainder operator
        int leftOver = number1 % number2;

        //Concatenation - String concatenation - joining string
        // joining variables with strings to create one WHOLE string

        System.out.println("Your name is: " + name);
        System.out.println("Your first number is: " + number1);
        System.out.println("Your second number is: " + number2);
        System.out.println("Addition is: " + addition);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        //Integer division returns just what is before the decimal
        System.out.println("The division is: " + division);
        System.out.println("Left over is: " + leftOver);

} }