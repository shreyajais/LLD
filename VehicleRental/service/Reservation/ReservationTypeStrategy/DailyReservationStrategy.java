package LLD.VehicleRental.service.Reservation.ReservationTypeStrategy;

import LLD.VehicleRental.domain.VehicleDomain.Vehicle;

public class DailyReservationStrategy implements ReservationStrategy {
    public double getPrice(Vehicle vehicle){
        return vehicle.getPricing().getDailyPrice();
    }
}
