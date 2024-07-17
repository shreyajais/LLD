package LLD.OnlineFoodDeliveryService.order;

import LLD.OnlineFoodDeliveryService.MenuItem;

import java.util.UUID;

public class OrderItem {

    private String id;
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
