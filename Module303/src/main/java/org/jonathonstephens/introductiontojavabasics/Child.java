package org.jonathonstephens.introductiontojavabasics;
/*
This is the CHILD/SUB/DERIVED class

Default access is also called Package access
 */


public class Child extends Parent {
    int id;

    @Override
    void parentMethod() {
        System.out.println("This is the method from the Child class");
    }
}
