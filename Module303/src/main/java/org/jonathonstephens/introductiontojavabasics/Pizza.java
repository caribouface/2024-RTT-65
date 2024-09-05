package org.jonathonstephens.introductiontojavabasics;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    // Constructor
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    // Getters
    public String getSize() {
        return size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public double calcCost() {
        double baseCost;
        switch (size.toLowerCase()) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza size");
        }
        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        return baseCost + (2 * totalToppings);
    }

    public String getDescription() {
        return size + " pizza with " +
                cheeseToppings + " cheese, " +
                pepperoniToppings + " pepperoni, and " +
                hamToppings + " ham toppings.";
    }
}
