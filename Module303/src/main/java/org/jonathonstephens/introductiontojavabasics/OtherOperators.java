package org.jonathonstephens.introductiontojavabasics;
/*
Now we will go over the other operators
Relational Operators
Conditional Operators
Assignment Operators
Unary Operators
 */
public class OtherOperators {
    public static void main(String[] args) {

       /* int a = 3, b = 4;

        boolean r;


        //egual to == - if the values of both of the operands are the same then it returns true:
        r = (a == b); //one = is for assignment, two = is for comparison of equality
        System.out.println(r); //false
        r = (a != b);
        System.out.println(r); //true
        r = (a > b);
        System.out.println(r); //false
        r = (a < b);
        System.out.println(r); //true
        r = (a >= b);
        System.out.println(r); //false
        r = (a <= b);
        System.out.println(r); //true


    Conditional Operators: used to combine conditional statements and return a boolean value
    They are SHORT CIRCUIT


        //Logical AND:
        System.out.println(a < b && b < a); //TRUE and FALSE so it returns FALSE
        System.out.println(a > b && b > a); //FALSE and TRUE so it returns FALSE
        System.out.println(a < b && b > a); //TRUE and TRUE so it returns true

        //Logical OR:
        System.out.println(a < b || b < a); //TRUE or FALSE so it returns TRUE
        System.out.println(a > b || b > a); //FALSE or TRUE so it returns TRUE
        System.out.println(a < b || b > a); //TRUE or TRUE so it returns TRUE

        //ASSIGNMENT OPERATORS:
        int x = 0;
        x = x + 5;   //x+=5;
        x = x - 5; //x-=5;
        //Shortened version
        x = x / 5;  //x/=5
        x = x * 5;  //x*=5
        x = x % 5;  //x%=5
        x = x << 5; //x<<=5
        x = x >> 5; //x>>=5
        x = x & 5;  //x&=5
        x = x | 5;  //x|=5
        x = x ^ 5;  //x^=5

        */

        //Unary Operators:
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        //Unary minus:
        int result = -a;
        System.out.println(result);

        //Incriment Operator
        //Post-imcrement:
        // c = b++;
        System.out.println("Value of c (b++) = " + c);
        //Value of c (b++) = 10
        System.out.println("Value of b (++a) = " + c);

        //Pre-imcrement:
        // c = ++a;
        System.out.println("Value of c (++a) = " + c);
        //Value of c (++a) = 21
        System.out.println("Value of a = " + a);

        //Post-decrement:
        // c = e--;
        System.out.println("Value of c (e--) = " + c);
        //Value of c (e--) = 40
        System.out.println("Value of e = " + e);

        //Pre-decrement:
        // c = --d;
        System.out.println("Value of c (--d) = " + c);
        //Value of c (--d) = 19
        System.out.println("Value of d = " + c);

    }}
