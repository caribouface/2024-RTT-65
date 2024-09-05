package org.jonathonstephens.introductiontojavabasics;

import java.util.Arrays;

public class ArrayManipulationPractice {
    public static void main(String[] args) {
        /*
        Remember the toString method is used to portray a STRING representation of the
        object (all objects inherit toString from the Object class)
         */
        boolean[] boolArray = new boolean[]{true, true, false, true};
        byte[] byteArray = new byte[]{10, 20, 30};
        char[] charArray = new char[]{'g', 'e', 'e', 'k', 's'};
        double[] doubleArray = new double[]{1, 2, 3, 4};
        int[] intArray = new int[]{1, 2, 3, 4};
        long[] longArray = new long[]{1, 2, 3, 4};
        float[] floatArray = new float[]{1, 2, 3, 4};
        short[] shortArray = new short[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(boolArray));
        System.out.println(Arrays.toString(byteArray));
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(longArray));
        System.out.println(Arrays.toString(floatArray));
        System.out.println(Arrays.toString(shortArray));


        //Arrays.fill90 - method
        double[] dValues = new double[100];
        Arrays.fill(dValues, 50.0);

        long[] lValues = new long[500];
        Arrays.fill(lValues, 2057);

        Arrays.fill(dValues, 6);
        for (double i : dValues) {
            System.out.println(i);
        }

        Arrays.fill(lValues, 2057);
        System.out.println(Arrays.toString(lValues));

        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(ar));
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar));


        //Arrays.sort() method:
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
    }



}

