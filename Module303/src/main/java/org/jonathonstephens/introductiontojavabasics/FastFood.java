package org.jonathonstephens.introductiontojavabasics;
import java.util.Scanner;
public class FastFood extends Food{
    Scanner  scanner = new Scanner(System.in);
    public FastFood(String[] nutrients, int numberOfNutrients, int calories, String color, String name, boolean cooked, Food.Taste taste,
                    Food.FoodGroup group, Food.Smell smell, boolean edible, double temperature, boolean organic) {
        super(nutrients, numberOfNutrients, calories, color, name, cooked, taste, group, smell, edible, temperature, organic);
    }

    public FastFood() {

    }

    public boolean checkNumberOfNutrients() {
        Scanner scanner = new Scanner(System.in);
        int numOfCalories;
        do {
            System.out.println("Please enter the number of calories:");
            numOfCalories = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (numOfCalories <= 100) {
                System.out.println("Calories must be greater than 100. Please try again.");
            }
        } while (numOfCalories <= 100);

        setCalories(numOfCalories);
        scanner.close(); // Close the scanner when done
        return true;
    }

    @Override
    public String eat(){
        String canEat = "";
        if (isEdible()){
            canEat = "You can't eat " + getName() + "\n You have had fast food this week, so no more fast food for you";
        } else {
            canEat = "You can eat " + getName(); // Handle the case where it's not edible
        }
        return canEat;
    }
}
