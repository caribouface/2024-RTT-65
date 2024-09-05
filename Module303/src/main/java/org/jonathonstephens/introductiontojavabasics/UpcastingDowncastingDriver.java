package org.jonathonstephens.introductiontojavabasics;
/*
Constructor - Parent() - Creates a new PARENT OBJECT
Child() - Creates a new CHILD OBJECT
Although we did not explicitly create a constructor it was created in the background -
a default, no argument constructor.
 */


import java.sql.SQLOutput;

public class UpcastingDowncastingDriver {
    public static void main(String[] args) {
        /*
        Upcasting:
        Remember. Child() creates a new CHILD OBJECT
        Create a new child and upgrade it to a parent object
         */
        Parent parent = new Child();
        parent.name="Java101";

        //Printing the values from the members (attributes and the members)
        System.out.println(parent.name);
        parent.parentMethod();//Child method because of overriding

        //Downcasting - implicitly
        // Child child = new Parent(); //a child is a parent but a parent is not a child

        //Downcasting Explicitly:
        Child child = (Child) parent;
        child.id=100;
        System.out.println(child.name);
        System.out.println(child.id);
        child.parentMethod();

    }
}

