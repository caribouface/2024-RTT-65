package org.jonathonstephens.introductiontojavabasics;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        // Creating objects
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        // Calling animalSound()
        myAnimal.animalSound();  // Output: The pig says: Oink Oink
        myPig.animalSound();     // Output: The pig says: Oink Oink
        myDog.animalSound();     // Output: The dog says: Woof Woof

        // Using instanceof to check object types (with the correction)
        System.out.println(myAnimal instanceof Animal); // true
        System.out.println(myAnimal instanceof Pig);    // false
        System.out.println(myPig instanceof Pig);       // true
        System.out.println(myPig instanceof Animal);    // true

        System.out.println(myAnimal instanceof Dog);    // false
        System.out.println(myDog instanceof Animal);    // true
        System.out.println(myDog instanceof Dog);       // true
    }
}
