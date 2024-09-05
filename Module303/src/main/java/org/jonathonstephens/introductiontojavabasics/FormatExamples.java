package org.jonathonstephens.introductiontojavabasics;

/*
System format() method
System printf() method
String format() method
 */
public class FormatExamples {
    public static void main(String[] args) {
        //format method from the System class:
        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format(" This is an integer: %d \n ...and this is a byte: %d.\r\n", i, b);
        System.out.format(" This is a double: %.4f \n ...and this is tiny: %.4e.\r\n", d, tiny);
        System.out.format(" And this is a String: %s", "This is a string.\r\n");


    }
}
