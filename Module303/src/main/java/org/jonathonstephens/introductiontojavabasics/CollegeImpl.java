package org.jonathonstephens.introductiontojavabasics;

public class CollegeImpl implements College{
    @Override
    public void getCourseName() {
        System.out.println("Core Java");
    }

    @Override
    public void getIAName() {
        System.out.println("Omar Pina");

    }

    @Override
    public void getInstructor() {
        System.out.println("Ezra WIlliams");

    }

    @Override
    public void getProgramDuration() {
        System.out.println("15 Weeks");

    }
}
