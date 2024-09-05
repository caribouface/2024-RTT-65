package org.jonathonstephens.introductiontojavabasics;

public class ArrayDemo {
    public static void main(String[] args) {
        //declare my array:
        double[] grades = new double[30]; /* this is an array of
        type double and we want the JVM to allocate 30 elements */

        //long way:
        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 80;
        grades[3] = 70;
        grades[4] = 60;
        grades[5] = 50;
        grades[6] = 40;
        grades[7] = 30;
        grades[8] = 20;
        grades[9] = 100;
        grades[10] = 45;
        grades[11] = 45;
        grades[12] = 35;
        grades[13] = 25;
        grades[14] = 15;
        grades[15] = 0;
        grades[16] = 60;
        grades[17] = 100;
        grades[18] = 100;
        grades[19] = 100;
        grades[20] = 100;
        grades[21] = 90;
        grades[22] = 80;
        grades[23] = 70;
        grades[24] = 60;
        grades[25] = 50;
        grades[26] = 40;
        grades[27] = 30;
        grades[28] = 20;
        grades[29] = 100;

        double sum = 0, average = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];  /*
            take all the grades and add it to the sum
            sum = sum +grades[i], sum = grades[]
            */

        } //we will now have asum of all the values in the array
        //average
        average = sum / grades.length;
        System.out.println("Average grade: " + average);

        String[] myStringArray;
        myStringArray = new String[5];
        myStringArray[0] = "A";
        myStringArray[1] = "B";
        myStringArray[2] = "C";
        myStringArray[3] = "D";
        myStringArray[4] = "F";

        //Declaration and initialization of our elements in one step:
        int[] myIntArray = {1,3,5,7,9,11};
        /*
        int[] myIntArray = new int[6];
        myIntArray[0]=1;..............
         */

    }
}
