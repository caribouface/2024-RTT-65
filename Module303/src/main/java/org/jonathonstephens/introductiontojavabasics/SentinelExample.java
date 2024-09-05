package org.jonathonstephens.introductiontojavabasics;

import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer (if you enter 0, this ends the app): ");
        int data = in.nextInt();

        int sum=0;
        while (data !=0){
            sum = sum + data;

            System.out.print("Enter an integer again (remember to enter a 0 to stop: ");
            data = in.nextInt();
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
