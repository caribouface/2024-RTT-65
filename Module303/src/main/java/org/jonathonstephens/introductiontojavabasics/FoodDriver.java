package org.jonathonstephens.introductiontojavabasics;

public class FoodDriver {
    public static void main(String[] args) {
        // Create FastFood object representing a milkshake
        String[] nutrients = {"Calcium", "Protein", "Sugar"};
        FastFood milkshake = new FastFood(nutrients, 3, 0, "Pink", "Strawberry Milkshake", true,
                Food.Taste.SWEET, Food.FoodGroup.DAIRY, Food.Smell.FRUITY,
                true, 5.0, false); // Assuming 5.0 degrees Celsius

        // Check and set the number of calories
        milkshake.checkNumberOfNutrients();

        // Print information about the milkshake
        System.out.println("Milkshake details:");
        System.out.println("Name: " + milkshake.getName());
        System.out.println("Calories: " + milkshake.getCalories());
        System.out.println("Food Group: " + milkshake.getFoodGroup());
        System.out.println("Temperature: " + milkshake.getTemperature() + "°C");
        System.out.println(milkshake.eat());
    }
}
