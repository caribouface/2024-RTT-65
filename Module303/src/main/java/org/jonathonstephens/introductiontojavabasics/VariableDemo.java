package org.jonathonstephens.introductiontojavabasics;
/*
Variable - is a memory address and it holds something
There are various types of variables - data type
Student name - String - sequence of characters
Student age - int (integer) - whole number
Student grade - double or float - decimal type
Student social security number - long - really long whole number
Declare (define), assignment (give it a value)
*/


public class VariableDemo {
    public static void main(String[] args) {
        //Declaration:
        String studentName;
        int studentAge;
        double studentGrade;
        long socialSecurityNumber;

        //Assignment:
        studentName = "Jonathon Stephens";
        studentAge = 38;
        studentGrade = 3.5;
        socialSecurityNumber = 123456789;

        //Declare and Assign:
        String studentName2 = "Zurika S Yahaya"; //lower camel case
        String _studentName = "Rabah Touahri";
        String $studentName = "Omar Pina";
        String student_name = "Jessica Bridget Whitworth"; //snake case
        String STUDENTNAME = "Yu Chen Solomon"; //uppercase
        String sTuDeNtNaMe = "Justice A Davila";
        studentName = "Zurika Yahaya";
        studentAge = 30;
        String password = "Hello123&80)";
        String name1="Takeisha LR White", name2="Sridevi Venkatesh", name3="Goyo Maddox";
        String name4, name5, name6;
        int num1=1, num2=2, num3=3, num4=4, num5=5;
        Integer num6; //Wrapper class
            //a string literal in Java is when you declare and assign a value on the same line


        //Character typer: characters on the keyboard:
        char letterA = 'A';
        char dollarSign =  '$';
        char tilde = '~';
        char letterB = 66; //U+0042

        //Integral types - whole number types:
        // whole number -128 to 127:
        byte b = 10;
        //whole number -32768 to 32767:
        short s = 128;
        //int -2147483648 to 2147483647:
        int i = 32768;
        //long -9223372036854808 to 9223372036854807
        long l = 21474836478L;


        //Decimal types:
        float f = 3.14f; //Float values you need an f - f, F
        double d = 3.14;

        //Boolean - true/false type:
        boolean bool = true;
        boolean b1 = false;

        //Escape sequences:
        System.out.println("This will print on \r\ntwo lines");// \r Carriage-return character.
        // \n Newline character
        System.out.println("She said \"Hello\" to me!"); // \"double-quote character
        System.out.println("This will print two back-slashes \\\\"); // \\ backslash character

        //CONSTANT - the value does not change
        final String MONDAY = "Monday";
        final double PI = 3.14;
        final String SCHOOL = "Per Scholas";


    }

}
