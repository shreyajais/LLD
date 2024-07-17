package LLD.OnlineFoodDeliveryService;

import java.util.UUID;

public class MenuItem {
    private final String id;
    private final String name;
    private final String description;
    private String imageUrl;
    private double price;
    private boolean isAvailable;

    public MenuItem(String name, String description, String imageUrl, double price, boolean isAvailable) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
