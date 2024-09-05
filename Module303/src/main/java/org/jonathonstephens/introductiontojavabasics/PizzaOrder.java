package org.jonathonstephens.introductiontojavabasics;

class PizzaOrder {
    private Pizza[] pizzas = new Pizza[3]; // Array to store up to 3 pizzas
    private int numPizzas = 0; // Number of pizzas currently in the order

    public void addPizza(Pizza pizza) {
        if (numPizzas < 3) {
            pizzas[numPizzas++] = pizza;
        } else {
            System.out.println("Order is full. Cannot add more pizzas.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }
}
