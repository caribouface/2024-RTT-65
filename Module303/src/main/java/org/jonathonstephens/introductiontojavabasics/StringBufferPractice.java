package org.jonathonstephens.introductiontojavabasics;
/*
Cousin to the String class
Creates objects but they hold a MUTABLE sequence of characters
Because the Strings are mutable, they can grow and shrink
unlike String objects which are IMMUTABLE
 */
public class StringBufferPractice {
    public static void main(String[] args) {
        /* StringBuffer str = new StringBuffer("Java Full Stack Developer");
        int len = str.length();
        System.out.println("Length : " + len);
        int cap = str.capacity(); //Java allocates a capacity by default of 16
        System.out.println("Capacity : " + cap);
// ----- append()--------------------
        str.append("and Software Eng ");
        System.out.println(str);
        str.append("Java is my favorite language");
        str.append("but I love python");
        System.out.println(str);

        StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
        System.out.println(stringName);
        stringName.reverse();
        System.out.println(stringName);
        /*
        StringBuffer sT = new StringBuffer("Java");
        System.out.println(sT);
        sT.replace(0, 2, "Hello");
        System.out.println(sT);

        StringBuffer str = new StringBuffer("Welcome to Java Fullstack ");
        System.out.println("Original string: " + str);
        System.out.println("Substring with start index: " + str.substring(5));
        System.out.println("Substring with start and end index: " + str.substring(5, 10));









*/

    }

}
