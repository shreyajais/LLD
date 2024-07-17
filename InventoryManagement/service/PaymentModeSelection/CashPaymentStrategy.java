package LLD.InventoryManagement.service.PaymentModeSelection;

import LLD.InventoryManagement.domain.Order;

public class CashPaymentStrategy implements PaymentModeStrategy{
    @Override
    public boolean takePayment(Order order) {
        return true;
    }
}
