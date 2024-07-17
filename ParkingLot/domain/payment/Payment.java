package LLD.ParkingLot.domain.payment;
import LLD.ParkingLot.PaymentModeSelection.PaymentModeStrategy;
import LLD.ParkingLot.domain.ParkingSpot;
import LLD.ParkingLot.domain.ParkingTicket;
import LLD.VehicleRental.domain.VehicleDomain.Vehicle;

import java.util.UUID;

public class Payment {
    String id;
    double amount;
    Invoice invoice;
    PaymentModeStrategy paymentModeStrategy;
    PaymentStatus paymentStatus;
    String referenceNumber;
    ParkingSpot parkingSpot;

    public Payment(ParkingSpot parkingSpot) {
        this.id = UUID.randomUUID().toString();
        this.invoice = new Invoice();
        this.amount = 0;
        this.paymentModeStrategy = null;
        this.paymentStatus = PaymentStatus.PENDING;
        this.referenceNumber = null;
        this.parkingSpot = parkingSpot;
    }

    public Payment takePayment(double amount, PaymentModeStrategy paymentModeStrategy, ParkingTicket parkingTicket){
        Payment paymentForOrder = paymentModeStrategy.takePayment(parkingTicket);
        updatePaymentStatusToSuccess();
        invoice.updateStatusToPaid();
        return paymentForOrder;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setPaymentModeStrategy(PaymentModeStrategy paymentModeStrategy) {
        this.paymentModeStrategy = paymentModeStrategy;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    private void updatePaymentStatusToSuccess() {
        this.paymentStatus = PaymentStatus.PAID;
    }
}
