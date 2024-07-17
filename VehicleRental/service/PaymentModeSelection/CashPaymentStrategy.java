package LLD.VehicleRental.service.PaymentModeSelection;
import LLD.VehicleRental.domain.PaymentDomain.Payment;
import LLD.VehicleRental.domain.Reservation;

public class CashPaymentStrategy implements PaymentModeStrategy {
    @Override
    public Payment takePayment(Reservation reservation) {
        return null;
    }
}
