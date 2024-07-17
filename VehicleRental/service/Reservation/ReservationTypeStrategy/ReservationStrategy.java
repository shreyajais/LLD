package LLD.VehicleRental.service.Reservation.ReservationTypeStrategy;

import LLD.VehicleRental.domain.VehicleDomain.Vehicle;

public interface ReservationStrategy {
    public double getPrice(Vehicle vehicle);

}
