package LLD.CoffeeVendingMachine;

import java.util.Map;
import java.util.UUID;

public class Coffee {
    private final String id;
    private final String name;
    private final double price;
    private final Map<Ingredients, Double> ingredientsList;

    public Coffee(String name, double price, Map<Ingredients, Double> ingredientsList) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        this.ingredientsList = ingredientsList;
    }
}
