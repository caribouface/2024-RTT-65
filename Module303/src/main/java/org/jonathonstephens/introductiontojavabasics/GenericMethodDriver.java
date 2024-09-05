package org.jonathonstephens.introductiontojavabasics;

public class GenericMethodDriver {
    public static void main(String[] args) {
        GenericMethodExample ge = new GenericMethodExample();
        ge.printValues(43); //Integer
        ge.printValues("Ezra");
        ge.printValues(4.5);//Double
        ge.printValues('E');//Character
        ge.printValues(true);//Boolean
        ge.printValues(new Student("Justice", "A", "", 123456, 100, "Mrs. Justice"));

        GenericMethodExample.staticDisplayData(43);
        GenericMethodExample.staticDisplayData("Ezra");
        GenericMethodExample.staticDisplayData(4.5);
        GenericMethodExample.staticDisplayData('E');
        GenericMethodExample.staticDisplayData(true);
        GenericMethodExample.staticDisplayData(new Student("Justice", "A", "", 123456, 100, "Mrs. Justice"));

        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'E', 'E', 'E', 'E', 'E', 'E' };
        Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0 };
        Boolean[] booleanArray = { true, false, true };

    }

}
