package org.jonathonstephens.introductiontojavabasics;

public class BitwiseOperations {
    public static void main(String[] args)
    {
        // Initial values
        int a = 5;
        int b = 7;

        // bitwise and   // 0101 & 0111=0101 = 5

        System.out.println("a&b = " + (a & b));

        // bitwise or    // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor  0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not     // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);

        //ternary operator - shorthand operator

        /*if (age < 100){
        result = "Less than 100";
        } else { //if age > 100
            result = "Greater than 100";
         */


// can also be combined with assignment operator to provide shorthand assignment
// a=a&b
a &= b;
        System.out.println("a= " + a);
    }
            }

