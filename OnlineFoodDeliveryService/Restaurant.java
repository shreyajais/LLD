package LLD.OnlineFoodDeliveryService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {

    private final String id;
    private final String name;
    private final String description;
    private String imageUrl;
    private List<MenuItem> menuItemList;
    private boolean isOpen;

    public Restaurant(String id, String name, String description, String imageUrl, List<MenuItem> menuItemList, boolean isOpen) {
        this.id = generate(name);
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.menuItemList = new ArrayList<>();
        this.isOpen = isOpen;
    }

    public void addMenuItem(MenuItem menuItem){
        this.menuItemList.add(menuItem);
    }
    public boolean isOpen(){
        return this.isOpen;
    }

    private String generate(String name){
        return "REST" + name + UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
