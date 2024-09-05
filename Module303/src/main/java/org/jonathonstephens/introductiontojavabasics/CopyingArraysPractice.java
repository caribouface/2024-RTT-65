package org.jonathonstephens.introductiontojavabasics;

import java.util.Arrays;

public class CopyingArraysPractice {
    public static void main(String[] args) {
        /*
        These are two DIFFERENT objects
         */
        int[] sourceArrays = {2,3,4,5,10};
        int[] targetArrays = new int[sourceArrays.length];
        for(int i =0; i < sourceArrays.length; i++)
        {
            targetArrays[i] = sourceArrays[i];
        }
        System.out.println(Arrays.toString(targetArrays));
        System.out.println(Arrays.toString(sourceArrays));


        if (targetArrays == sourceArrays) {
            System.out.println("same instance");
        } else {
            System.out.println("different instances");
        }
        int lastIndex = targetArrays.length - 1;
        targetArrays[lastIndex] = 500;
        System.out.println(Arrays.toString(targetArrays));
        System.out.println(Arrays.toString(sourceArrays));

        //Object.clone() - Remember the Object class is the SUPERCLASS of all classes:
        int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        System.out.println(Arrays.toString(targetArray));
        System.out.println(Arrays.toString(sourceArray));
        sourceArray[2] = 500;
        System.out.println("Source Array:  " +Arrays.toString(sourceArray));
        System.out.println("Target Array:  " +Arrays.toString(targetArray));
        int[] targetArray2 = new int[2];

        //System - arrayCopy method:
        System.arraycopy(sourceArray, 2, targetArray2, 1, 1);
        System.out.println(Arrays.toString(targetArray2));

        //Arrays copyOf method:
        int[] targetArray3 = Arrays.copyOf(targetArray2, 2);
        System.out.println(Arrays.toString(targetArray3));


    }

}
