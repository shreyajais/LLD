package LLD.RestaurantManagementSystem;

import java.util.UUID;

public class Table {
    private final String id;
    private boolean isAvailable;

    public Table() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
