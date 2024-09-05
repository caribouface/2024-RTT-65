package org.jonathonstephens.introductiontojavabasics;
/*
Body Mass Index (BMI) is a measure of health on weight.
It is calculated by taking an individual’s weight in kilograms and
dividing by the square of their height in meters.
        BMI = (Weight in Kg) / (Height in Meters * Height in Meters)
        For example,
                weight = 75 kg, height = 1.5 m
        BMI = 75 / (1.5*1.5) = 33.33
BMI                 Interpretation

<18.5               Underweight
18.5 <=BMI <25.0    Normal
25.0 <= BMI < 30.0  Overweight
30.0 <= BMI         Obese
 */

import java.util.Scanner;

public class BodyMassIndexExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get weight input in pounds
        System.out.print("Enter your weight (in pounds): ");
        double weightInPounds = in.nextDouble();

        // Get height input in feet and inches
        System.out.print("Enter your height in feet: ");
        int feet = in.nextInt();
        System.out.print("Enter the remaining inches: ");
        int inches = in.nextInt();

        // Convert height to inches
        int totalInches = (feet * 12) + inches;

        // Convert weight to kilograms (1 pound = 0.453592 kilograms)
        double weightInKilograms = weightInPounds * 0.453592;

        // Convert height to meters (1 inch = 0.0254 meters)
        double heightInMeters = totalInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Interpret BMI and print the result
        if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi + ", which is categorized as Underweight.");
        } else if (bmi < 25.0) {
            System.out.println("Your BMI is " + bmi + ", which is categorized as Normal.");
        } else if (bmi < 30.0) {
            System.out.println("Your BMI is " + bmi + ", which is categorized as Overweight.");
        } else {
            System.out.println("Your BMI is " + bmi + ", which is categorized as Obese.");
        }



    }
}
