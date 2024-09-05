package org.jonathonstephens.introductiontojavabasics;

public class ArrayTraversalExample {
    public static void main(String[] args) {
        int [] values = new int [5];//an array of 5 zeros 0 0 0 0 0
        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i-1]; // 1 + 0
            //first iteration = 0 1 0 0 0
            //second iteration = 0 1 3 0 0
            //third iteration = 0 1 3 6 0
            //fourth iteration = 0 1 3 6 10
        }
        values[0] = values[1] + values[4]; // 11 1 3 6 10


    }
}
