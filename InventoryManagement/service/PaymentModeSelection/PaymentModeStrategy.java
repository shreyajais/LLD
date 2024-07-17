package LLD.InventoryManagement.service.PaymentModeSelection;

import LLD.InventoryManagement.domain.Order;

public interface PaymentModeStrategy {
    public boolean takePayment(Order order);
}
