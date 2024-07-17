package LLD.VehicleRental.domain;

import LLD.VehicleRental.domain.PaymentDomain.Payment;
import LLD.VehicleRental.domain.VehicleDomain.Vehicle;

import java.util.UUID;

public class Reservation {
    String id;
    Vehicle vehicle;
    ReservationType reservationType;
    Payment payment;
    User user;

    public Reservation(Vehicle vehicle, ReservationType reservationType, User user) {
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.reservationType = reservationType;
        this.user = user;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
