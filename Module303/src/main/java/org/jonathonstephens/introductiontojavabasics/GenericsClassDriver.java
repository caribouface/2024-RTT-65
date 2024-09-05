package org.jonathonstephens.introductiontojavabasics;

public class GenericsClassDriver {
    public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        GenericsClass<String>
                stringObj = new GenericsClass<>("Java");

        System.out.println("Generic Class returns: " + stringObj.getData());

        Student student = new Student("Justice", "A", "", 123456, 100, "Mrs. Justice");
        GenericsClass<Student> intObj2 = new GenericsClass<>(student);

        System.out.println("Generic Class returns: " + intObj2.getData());

    }
}
