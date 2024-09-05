package org.jonathonstephens.introductiontojavabasics;
/*
Super class, parent class, base class
 */


public class LivingThing {
    //field and method of the parent class:
    /*
    protected means accessible within the class, the package, and the subclass
     */

    protected String name;

    public LivingThing() {}

    public LivingThing(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat");
    }

    public void communicate(){
        System.out.println("I can communicate");
    }
}
