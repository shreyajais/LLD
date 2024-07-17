package LLD.InventoryManagement.domain;

public class OrderItem {
    String id;
    String productId;
    int quantity;
    double amount;
    Shipment shipment;
    WareHouse wareHouse;
    User user;
}
