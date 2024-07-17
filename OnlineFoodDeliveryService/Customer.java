package LLD.OnlineFoodDeliveryService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private final String id;
    private final String name;
    private final String contact;
    private List<Address> addressList;

    public Customer(String name, String contact, List<Address> addressList) {
        this.id = generateId(name);
        this.name = name;
        this.contact = contact;
        this.addressList = new ArrayList<>();
    }

    public void addAddress(Address address){
        this.addressList.add(address);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private String generateId(String name){
        return "CUS" + "name" + UUID.randomUUID();
    }
}
