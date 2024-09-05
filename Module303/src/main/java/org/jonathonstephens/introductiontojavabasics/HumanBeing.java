package org.jonathonstephens.introductiontojavabasics;
/*
In Java the extends keyword is used for inheritance
Sub class, child class, derived class
 */

public class HumanBeing extends LivingThing{

    static String organizationName;

    public HumanBeing(String name){
        super(name);

    }
    public void display(){
        System.out.println("My name is "+super.name); //access parent class attribute
        super.eat();
        System.out.println("My name is "+super.name);



    }

    //override the eat() method:
    /*
    Overriding is also another branch of Polymorphism. Essentially, it is
    different from overloading because with overriding, the METHOD HEADER,
    including THE METHOD SIGNATURE has to be the EXACT replica
    of the METHOD HEADER in the parent class
     */

    @Override
    public void eat(){
        System.out.println("I enjoy eating pizza with soda");
    }

    @Override
    public void communicate() {
        System.out.println("I can communicate with language");
    }
}
