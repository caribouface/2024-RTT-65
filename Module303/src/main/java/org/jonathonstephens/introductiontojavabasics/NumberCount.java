package org.jonathonstephens.introductiontojavabasics;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 2;
        String input;

        while (true){//it's saying that this is always true
            System.out.println(num);
            System.out.print("Do you want to keep counting? (Y or N)");
            input = in.nextLine();
            /*
            next() - get anything up to the white space
            nextLine() - get the whole line white space included
             */
            if (input.equalsIgnoreCase("N")) {
                break;//Leave the while loop
            }
            num += 2;

        }
        System.out.println("Okay, we are done!");
    }
}
