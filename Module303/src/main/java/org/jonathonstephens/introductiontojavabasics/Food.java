package org.jonathonstephens.introductiontojavabasics;

/*
Super/Parent/Base Class:
This class will be common to all foods:
. Nutrients
. Smell
. Taste
. Edible
. Texture
. Temperature
. Names
. Food Group
. Cooked/raw
. Color
 */

public class Food {

    enum Smell{
        FLORAL,
        FRUITY,
        SPICY,
        MUSKY,
        EARTHY,
        WOODY,
    }
    enum Taste{
        BITTER,
        SOUR,
        SWEET,
        SALTY,
        SPICY
    }
    enum FoodGroup{
        FRUITS,
        VEGETABLES,
        GRAINS,
        PROTEIN,
        DAIRY
    }

    private String nutrients;
    private int NumberOfNutrients;
    private int calories;
    private String color;
    private String name;
    private boolean cooked;
    private Taste taste;
    private FoodGroup foodGroup;
    private Smell smell;
    private boolean edible;
    private double temperature;
    private boolean organic;

    //Constructors:
    public Food(){

    }

    public Food(String[] nutrients, int NumberOfNutrients, int calories, String color, String name, boolean cooked, Taste taste,
                FoodGroup group, Smell smell, boolean edible, double temperature, boolean organic){

        this.nutrients = nutrients[0];
        this.NumberOfNutrients = NumberOfNutrients;
        this.calories = calories;
        this.color = color;
        this.name = name;
        this.cooked = cooked;
        this.taste = taste;
        this.foodGroup = group;
        this.smell = smell;
        this.edible = edible;
        this.temperature = temperature;
        this.organic = organic;
    }

    public void setNutrients(String nutrients){
        this.nutrients = nutrients;
    }
    public void setNumberOfNutrients(int NumberOfNutrients){
        this.NumberOfNutrients = NumberOfNutrients;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCooked(boolean cooked){
        this.cooked = cooked;
    }
    public void setTaste(Taste taste){
        this.taste = taste;
    }
    public void setFoodGroup(FoodGroup foodGroup){
        this.foodGroup = foodGroup;
    }
    public void setSmell(Smell smell){
        this.smell = smell;
    }
    public void setEdible(boolean edible){
        this.edible = edible;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    public void setOrganic(boolean organic){
        this.organic = organic;
    }
    public String getNutrients(){
        return nutrients;
    }
    public int getNumberOfNutrients(){
        return NumberOfNutrients;
    }
    public int getCalories(){
        return calories;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public boolean isCooked(){
        return cooked;
    }
    public Taste getTaste(){
        return taste;
    }
    public FoodGroup getFoodGroup(){
        return foodGroup;
    }
    public Smell getSmell(){
        return smell;
    }
    public boolean isEdible(){
        return edible;
    }
    public double getTemperature(){
        return temperature;
    }
    public boolean isOrganic(){
        return organic;
    }

    public String eat() {
        String canEat = "";
        if (edible) {
            canEat = "You can eat " + name;
        } else {
            canEat = "You can't eat " + name;
        }
        return canEat; // Add the return statement to send the result back
    }

}
