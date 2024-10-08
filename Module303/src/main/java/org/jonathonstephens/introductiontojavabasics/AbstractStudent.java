package org.jonathonstephens.introductiontojavabasics;
/*
. An abstract class May have both regular and abstract methods
. Differences between Concrete classes and Abstract classes
. Concrete class - we DO NOT need to override methods - it is a choice
. Abstract class - we have Abstract methods, and they MUST be implemented in the child.
. A concrete class can be instantiated (WE CAN CREATE OBJECTS/INSTANCES) of that class
however an Abstract class CANNOT BE INSTANTIATED!
. Similarity between Concrete and Abstract - both use EXTENDS keyword
. We are NOT allowed to instantiate an object of an abstract type (DIRECTLY) because
the class contains unimplemented methods
*/

public abstract class AbstractStudent {
    static final protected String COLLEGENAME = "Per scholas";
    protected String username;
    protected String password;
    protected int rollNumber;


    //abstract method (method shells/definitions)
    public abstract void displayInformation();
    public abstract String[] getFullName(String[] fullname);


    //regular methods
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }



}


    // Constructor

