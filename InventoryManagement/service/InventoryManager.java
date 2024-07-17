package LLD.InventoryManagement.service;

import LLD.InventoryManagement.domain.*;
import LLD.InventoryManagement.service.PaymentModeSelection.PaymentModeStrategy;
import LLD.InventoryManagement.service.WareHouseSelection.WareHouseController;
import LLD.InventoryManagement.service.WareHouseSelection.WareHouseLocationStrategy;

import java.util.List;

public class InventoryManager {

    WareHouseController wareHouseController;
    PaymentModeStrategy paymentMode;
    public OrderItem createOrderItem(Product product, int quantity, User user){
        return new OrderItem();
    }
    public Order createOrder(User user, Address address, List<OrderItem> orderItemList){
        return new Order();
    }
    public void takePayment(Order order){
        paymentMode.takePayment(order);
    }
}
