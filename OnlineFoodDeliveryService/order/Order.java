package LLD.OnlineFoodDeliveryService.order;

import LLD.OnlineFoodDeliveryService.Address;
import LLD.OnlineFoodDeliveryService.DeliveryAgent;
import LLD.OnlineFoodDeliveryService.MenuItem;
import LLD.OnlineFoodDeliveryService.Payment.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Order {

    private final String id;

    private OrderStatus orderStatus;
    private final String restaurantId;
    private final String customerId;
    private Address address;
    private DeliveryAgent deliveryAgent;
    private List<OrderItem> orderItemList;
    private final double price;
    private Payment payment;

    public Order(String restaurantId, String customerId, Address address) {
        this.id = generate(restaurantId, customerId);
        this.restaurantId = restaurantId;
        this.customerId = customerId;
        this.address = address;
        this.deliveryAgent = null;
        this.orderItemList = new ArrayList<>();
        this.price = calculatePrice();
        this.orderStatus = OrderStatus.PLACED;
    }

    private String generate(String restaurantId, String customerId){
        return "ORDER" + restaurantId + customerId + UUID.randomUUID().toString();
    }

    private double calculatePrice(){
        double sum =0;
        for(OrderItem orderItem: this.orderItemList){
            sum+= orderItem.getMenuItem().getPrice()*orderItem.getQuantity();
        }
        return sum;
    }

    public String getId() {
        return id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public void addOrderItem(OrderItem orderItem){
        this.orderItemList.add(orderItem);
    }
    public void updateStatus(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
