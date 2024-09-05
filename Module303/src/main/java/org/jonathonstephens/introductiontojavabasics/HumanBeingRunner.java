package org.jonathonstephens.introductiontojavabasics;

public class HumanBeingRunner {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Create an object of type HumanBeing
        HumanBeing HObj = new HumanBeing("Mr Best");
        //Access field of the super/parent/base class - LivingThing:
        HObj.name = "Mr Best";
        HObj.display();

        //Call the method of the superclass by using the subclass type object:
        HObj.eat();
        HObj.communicate();

        //Another object:
        HumanBeing HObj2 = new HumanBeing("Mr Worst");
        HObj2.eat();


        //Static variables belong directly to the class:
        HumanBeing.organizationName = "Per Scholas";
        HObj.display();
        HObj2.display();
        HumanBeing.organizationName = "Per Scholas 2.0";
        HObj2.display();
        HObj.display();
    }
}
