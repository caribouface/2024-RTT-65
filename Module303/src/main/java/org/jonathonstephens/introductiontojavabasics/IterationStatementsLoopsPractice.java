package org.jonathonstephens.introductiontojavabasics;

public class IterationStatementsLoopsPractice {
    public static void main(String[] args) {

        /*
        initialization - where do we start? i=1
        condition (continuation) - dictates how many times (iterations)
        increment - how many skips we want - i+1 - we skip by one
         */

        //Printing numbers from 1-100:
        System.out.println(1);
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
        //We are printing Welcome to Full Stack Java 100 times:
        for (int j=0; j<100; j++){
            System.out.println("Welcome to Full Stack Java!");
        }

        int weeks = 3;
        int days = 7;

        //outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) { //iterates 3 times
            System.out.println("Week " + i + "\n");

            //inner loop prints days
            for (int j = 1; j <= days; ++j) { //every time this inner for loop iterates
                System.out.println("Day " + j);
            }
        }
    }
}
