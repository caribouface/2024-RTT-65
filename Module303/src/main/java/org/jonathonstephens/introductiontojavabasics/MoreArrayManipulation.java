package org.jonathonstephens.introductiontojavabasics;

public class MoreArrayManipulation {
    public static void main(String[] args) {
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}