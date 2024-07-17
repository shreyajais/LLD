package LLD.RestaurantManagementSystem.orderManagement;

import LLD.RestaurantManagementSystem.Payment.Payment;
import LLD.RestaurantManagementSystem.StaffManagement.Staff;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private final String id;

    private OrderStatus orderStatus;
    private final String tableId;
    private Staff staff;
    private List<OrderItem> orderItemList;
    private final double price;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Payment payment;

    public Order(String tableId, Staff staff, List<OrderItem> orderItemList) {
        this.id = generate(tableId);
        this.orderStatus = OrderStatus.PLACED;
        this.tableId = tableId;
        this.orderItemList = orderItemList;
        this.price = calculatePrice();
        this.createdAt = LocalDateTime.now();
    }

    private String generate(String tableId){
        return "ORDER" + tableId + Timestamp.valueOf(LocalDateTime.now());
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

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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
