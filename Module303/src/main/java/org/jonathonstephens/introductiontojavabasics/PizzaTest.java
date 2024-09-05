package org.jonathonstephens.introductiontojavabasics;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", 1, 1, 2);
        Pizza pizza2 = new Pizza("Medium", 2, 0, 1);

        System.out.println(pizza1.getDescription() + " Cost: $" + pizza1.calcCost());
        System.out.println(pizza2.getDescription() + " Cost: $" + pizza2.calcCost());

        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        System.out.println("Total cost of the order: $" + order.calcTotal());
    }
}
