package org.jonathonstephens.introductiontojavabasics;
/*
Classes in Java should be in UpperCamelCase
Everything that belongs to the class goes inside the curly braces
Our class is public means it is accessible to other classes
This is a MULTI-LINE Comment - it spans lines
What is a comment - just a note for me for you
Curly braces - every BLOCK of code is inside of opening and closing curly braces
 */

/**
 * JAVADOCS - special comments - they create a special document
 * that includes whatever you write in here.
 */
public class WelcomeToJava {
    /*
    The main method is the entry point into our application
    Public - accessible to any outside classes
    static - belongs DIRECTLY to the WelcomeToJava class
    void - does not RETURN a value
    In parentheses we see what the method takes in
     */
    public static void main(String[] args) {
        //One line comments use this format
        /*
        In Java, we use the System class print methods (println (print line))
        to display things to the screen or console.
         */
        System.out.println("Welcome to Java!!!!!!! Yayyyy!!!");
        System.out.println("And we can write things to the screen!");
        System.out.println("We will still write the whole thing from scratch");
    }
}
