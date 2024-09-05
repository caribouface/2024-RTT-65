package org.jonathonstephens.introductiontojavabasics;

public class StudentService extends AbstractStudent implements College{
    private double gpa = 4.2;

    // No-argument constructor
    public StudentService() {
        // You can initialize default values here if needed
    }

    // Constructor to initialize student data
    public StudentService(String username, String password, int rollNumber) {
        this.username = username;
        this.password = password;
        this.rollNumber = rollNumber;
    }

    // Implementation of the abstract method displayInformation
    @Override
    public void displayInformation() {
        System.out.println("Welcome to: " + COLLEGENAME);
        System.out.println("Your username is: " + username);
        System.out.println("Your roll number is: " + rollNumber);
        // You might want to add more information here, like full name, courses, etc.
    }

    // Implementation of the abstract method getFullName
    @Override
    public String[] getFullName(String[] fullname) {
        // Basic implementation: just return the fullname as is
        return fullname;
    }

    @Override
    public void getCourseName() {
        System.out.println("Full Stack Java Development");

    }

    @Override
    public void getIAName() {
        System.out.println("Do not Assign");

    }

    @Override
    public void getInstructor() {
        System.out.println("Your instructor name is James");

    }

    @Override
    public void getProgramDuration() {
        System.out.println("15 Weeks");

    }
}
