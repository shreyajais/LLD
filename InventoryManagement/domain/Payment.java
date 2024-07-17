package LLD.InventoryManagement.domain;

import LLD.InventoryManagement.service.PaymentModeSelection.PaymentModeStrategy;

import java.util.UUID;

public class Payment {
    String id;
    double amount;
    Invoice invoice;
    PaymentModeStrategy paymentModeStrategy;
    PaymentStatus paymentStatus;
    String referenceNumber;
    User user;
    Order order;

    public Payment(double amount, PaymentModeStrategy paymentModeStrategy, User user, Order order) {
        this.id = UUID.randomUUID().toString();
        this.invoice = new Invoice();
        this.amount = amount;
        this.paymentModeStrategy = paymentModeStrategy;
        this.paymentStatus = PaymentStatus.PENDING;
        this.referenceNumber = null;
        this.user = user;
        this.order = order;
    }

    public Payment takePayment(double amount, PaymentModeStrategy paymentModeStrategy, PaymentStatus paymentStatus, String referenceNumber, User user, Order order){
        Payment payment = new Payment(amount, paymentModeStrategy, user, order);
        boolean paymentForOrder = paymentModeStrategy.takePayment(order);
        updatePaymentStatusToSuccess();
        invoice.updateStatusToPaid();
        return payment;
    }

    private void updatePaymentStatusToSuccess() {
    }
}
