package LLD.CoffeeVendingMachine;

import java.util.UUID;

public class Ingredients {
    private final String id;
    private final String name;
    private double inventoryQuantity;

    public Ingredients(String name, double inventoryQuantity) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.inventoryQuantity = inventoryQuantity;
    }

    public void updateQuantity(double quantity){
        this.inventoryQuantity+= quantity;
    }
}
