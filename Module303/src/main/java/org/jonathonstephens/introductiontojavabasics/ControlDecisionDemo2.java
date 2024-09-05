package org.jonathonstephens.introductiontojavabasics;

import java.util.Scanner;

public class ControlDecisionDemo2 {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 4;

        if (i > j) {
            if (i > k) {
                System.out.println("A");
            }
        } else
            System.out.println("B");

        //Nested decision statements;
        /*
        check age; if they are younger than 18, price is $5
        if they are 18 or older, then the price ia $10
        65+ is 5% discount
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        double price = 0, discount = 0.05;

        if (age < 18) {
            price = 5.00;
            System.out.println("Price is $5");
        } else {
            price = 10.00;
            System.out.println("Price is $10");}{
            if (age >= 65) {
                price = price - (price * discount);
                System.out.println("Final price after discount: $" + price);

            }
        }
    }}
