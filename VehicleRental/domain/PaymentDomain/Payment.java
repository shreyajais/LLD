package LLD.VehicleRental.domain.PaymentDomain;

import LLD.InventoryManagement.domain.Order;
import LLD.InventoryManagement.domain.User;
import LLD.VehicleRental.domain.Reservation;
import LLD.VehicleRental.service.PaymentModeSelection.PaymentModeStrategy;

import java.util.UUID;

public class Payment {
    String id;
    double amount;
    Invoice invoice;
    PaymentModeStrategy paymentModeStrategy;
    PaymentStatus paymentStatus;
    String referenceNumber;
    User user;
    Reservation reservation;

    public Payment(double amount, PaymentModeStrategy paymentModeStrategy, User user, Reservation reservation, String referenceNumber) {
        this.id = UUID.randomUUID().toString();
        this.invoice = new Invoice();
        this.amount = amount;
        this.paymentModeStrategy = paymentModeStrategy;
        this.paymentStatus = PaymentStatus.PENDING;
        this.referenceNumber = referenceNumber;
        this.user = user;
        this.reservation = reservation;
    }

    public Payment takePayment(double amount, PaymentModeStrategy paymentModeStrategy, PaymentStatus paymentStatus, String referenceNumber, User user, Reservation reservation){
        Payment paymentForOrder = paymentModeStrategy.takePayment(reservation);
        updatePaymentStatusToSuccess();
        invoice.updateStatusToPaid();
        return paymentForOrder;
    }

    public boolean isSuccessfull(){
        return paymentStatus == PaymentStatus.PAID;
    }

    private void updatePaymentStatusToSuccess() {
    }
}
