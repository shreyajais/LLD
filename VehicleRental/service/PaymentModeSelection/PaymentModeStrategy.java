package LLD.VehicleRental.service.PaymentModeSelection;

import LLD.VehicleRental.domain.PaymentDomain.Payment;
import LLD.VehicleRental.domain.Reservation;

public interface PaymentModeStrategy {
    public Payment takePayment(Reservation reservation);
}
