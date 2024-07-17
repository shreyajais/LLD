package LLD.OnlineFoodDeliveryService.Payment;

import LLD.OnlineFoodDeliveryService.order.Order;

public interface Payment {
    public void takePayment(double amount, Order order);
}
