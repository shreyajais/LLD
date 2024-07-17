package LLD.OnlineFoodDeliveryService;

import LLD.OnlineFoodDeliveryService.order.Order;
import LLD.OnlineFoodDeliveryService.order.OrderItem;
import LLD.OnlineFoodDeliveryService.order.OrderStatus;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FoodDeliverySystem {

    private static FoodDeliverySystem foodDeliverySystem;
    private Map<String, Restaurant> restaurantList;
    private  Map<String, Customer> customerList;
    private Map<String, Order> orderList;

    private Map<String, DeliveryAgent> deliveryAgentList;


    private FoodDeliverySystem() {
        this.restaurantList = new ConcurrentHashMap<>();
        this.customerList = new ConcurrentHashMap<>();
        this.orderList = new ConcurrentHashMap<>();
    }

    public static synchronized FoodDeliverySystem getInstance(){
        if(foodDeliverySystem!=null){
            return foodDeliverySystem;
        }
        else return  new FoodDeliverySystem();
    }

    public void addRestaurant(Restaurant restaurant){
        this.restaurantList.put(restaurant.getId(), restaurant);
    }

    public void addCustomer(Customer customer){
        this.customerList.put(customer.getId(), customer);
    }

    public void addDeliveryAgent(DeliveryAgent deliveryAgent){
        this.deliveryAgentList.put(deliveryAgent.getId(), deliveryAgent);
    }

    public void addMenuItemToRestaurant(MenuItem menuItem, String restaurantId){
        this.restaurantList.get(restaurantId).addMenuItem(menuItem);
    }

    public synchronized void placeOrder(String customerId, String restaurantId, Map<MenuItem, Integer> orderMap, Address address){
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
        if(orderStatus == OrderStatus.CANCELLED && order.getOrderStatus() != OrderStatus.PLACED){
            System.out.print("order now cannot be cancelled");
            return;
        }
        order.updateStatus(orderStatus);
        if(orderStatus == OrderStatus.CONFIRMED){
            assignDeliveryAgent(order);
        }
        notifyCustomer(order.getCustomerId(), order);
        notifyRestaurant(order.getRestaurantId(), order);
    }

    public synchronized void assignDeliveryAgent(Order order){
        for(DeliveryAgent deliveryAgent: this.deliveryAgentList.values()){
            if(deliveryAgent.isAvailable()){
                deliveryAgent.setAvailable(false);
                order.setDeliveryAgent(deliveryAgent);
                notifyDeliveryAgent(deliveryAgent, order);
                break;
            }
        }
    }
    public void notifyCustomer(String customerId, Order order){

    }

    public void notifyRestaurant(String restaurantId, Order order){

    }

    public void notifyDeliveryAgent(DeliveryAgent deliveryAgent, Order order){

    }
}
