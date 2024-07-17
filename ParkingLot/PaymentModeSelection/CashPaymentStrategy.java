package LLD.ParkingLot.PaymentModeSelection;

import LLD.ParkingLot.domain.ParkingSpot;
import LLD.ParkingLot.domain.ParkingTicket;
import LLD.ParkingLot.domain.payment.Payment;

public class CashPaymentStrategy implements PaymentModeStrategy {
    @Override
    public Payment takePayment(ParkingTicket parkingTicket) {
        return null;
    }
}
