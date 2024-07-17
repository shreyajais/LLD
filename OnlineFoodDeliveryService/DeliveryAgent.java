package LLD.OnlineFoodDeliveryService;

import java.util.UUID;

public class DeliveryAgent {
    private final String id;
    private final String name;
    private final String contact;

    private boolean isAvailable;

    public DeliveryAgent(String name, String contact) {
        this.id = generate(name);
        this.name = name;
        this.contact = contact;
    }

    private String generate(String name){
        return "DA" + name + UUID.randomUUID().toString();
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
