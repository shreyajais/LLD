package LLD.RestaurantManagementSystem;


import LLD.RestaurantManagementSystem.StaffManagement.RestaurantStaffController;
import LLD.RestaurantManagementSystem.StaffManagement.Staff;
import LLD.RestaurantManagementSystem.orderManagement.Order;
import LLD.RestaurantManagementSystem.orderManagement.OrderItem;
import LLD.RestaurantManagementSystem.orderManagement.OrderStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RestaurantSystem {

    private static RestaurantSystem restaurantSystem;

    private final RestaurantStaffController restaurantStaffController;
    private Map<String, Staff> staffMap;
    private  Map<String, Table> tableMap;
    private Map<String, Order> orderList;

    private List<MenuItem> menuItemList;

    private RestaurantSystem() {
        this.restaurantStaffController = RestaurantStaffController.getInstance();
        this.staffMap = new HashMap<>();
        this.tableMap = new HashMap<>();
        this.orderList = new ConcurrentHashMap<>();
        this.menuItemList = new ArrayList<>();
    }

    public static synchronized RestaurantSystem getInstance(){
        if(restaurantSystem==null) {
            restaurantSystem = new RestaurantSystem();
        }
        return restaurantSystem;
    }

    public void addStaff(Staff staff){
        this.staffMap.put(staff.getId(), staff);
    }

    public void addTable(Table table){
        this.tableMap.put(table.getId(), table);
    }

    public void addOrder(Order order){
        this.orderList.put(order.getId(), order);
    }

    public void addMenuItemToRestaurant(MenuItem menuItem){
        this.menuItemList.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem){
        this.menuItemList.remove(menuItem.getId());
    }

    public Table getAvailableTable(){
        for(Table table: tableMap.values()){
            if(table.isAvailable()) return table;
        }
        return null;
    }

    public void reserveTable(Table table){
        table.setAvailable(false);
    }

    public void setTableAvailable(Table table){
        table.setAvailable(true);
    }

    public void cancelReservation(Table table){
        table.setAvailable(true);
    }

    public List<MenuItem> getMenuItems(){
        return this.menuItemList;
    }

    public void placeOrder(Order order){}



    public synchronized void updateOrderStatus(String orderId, OrderStatus orderStatus){
        Order order = this.orderList.get(orderId);
        if(orderStatus == OrderStatus.CANCELLED && order.getOrderStatus() != OrderStatus.PLACED){
            System.out.print("order now cannot be cancelled");
            return;
        }
        order.setOrderStatus(orderStatus);
        if(orderStatus== OrderStatus.PREPARED){
            assignWaiter(order);
        }
    }


    public synchronized void placeOrder(){
        Order order = new Order(restaurantId, customerId, address);
        for(Map.Entry<MenuItem, Integer> orderItem: orderMap.entrySet()){
            if(orderItem.getKey().isAvailable()) order.addOrderItem(new OrderItem(orderItem.getKey(), orderItem.getValue()));
        }
        this.orderList.put(order.getId(), order);
        notifyCustomer(order.getCustomerId(), order);
        notifyRestaurant(order.getRestaurantId(), order);
    }

    public synchronized void updateOrderStatus(OrderStatus orderStatus, String orderId){
        Order order = this.orderList.get(orderId);
        if(orderStatus == OrderStatus.CANCELLED && order.getOrderStatus() != OrderStatus.CONFIRMED){
            System.out.print("order now cannot be cancelled");
            return;
        }
        order.updateStatus(orderStatus);
        if(orderStatus == OrderStatus.PLACED){
            Staff waiter = assignWaiter(order);
            notifyChef(waiter, order);
        } else notifyStaff(order);
    }

    public synchronized void assignChef(Order order){
        Staff chef = restaurantStaffController.getChefs().get(0);
        order.setStaff(chef);
        notifyChef(chef, order);
    }

    public synchronized Staff assignWaiter(Order order){
        Staff waiter = getAvailableWaiter();
        waiter.setAvailable(false);
        return waiter;
    }

    public Staff getAvailableWaiter(){
        List<Staff> waiter = restaurantStaffController.getWaiters();
        if(waiter.isEmpty()) return null;
        else return waiter.get(0);
    }

    public void notifyWaiter(Staff staff, Order order){

    }

    public void notifyChef(Staff staff, Order order){

    }

    public void notifyStaff(Order order){

    }
}
