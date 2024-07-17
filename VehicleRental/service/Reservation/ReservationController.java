package LLD.VehicleRental.service.Reservation;
import LLD.VehicleRental.domain.PaymentDomain.Payment;
import LLD.VehicleRental.domain.Reservation;
import LLD.VehicleRental.domain.ReservationType;
import LLD.VehicleRental.domain.User;
import LLD.VehicleRental.domain.VehicleDomain.Vehicle;
import LLD.VehicleRental.service.PaymentModeSelection.PaymentModeStrategy;
import LLD.VehicleRental.service.Reservation.ReservationTypeStrategy.DailyReservationStrategy;
import LLD.VehicleRental.service.Reservation.ReservationTypeStrategy.MonthlyReservationStrategy;
import LLD.VehicleRental.service.Reservation.ReservationTypeStrategy.ReservationStrategy;
import LLD.VehicleRental.service.Reservation.ReservationTypeStrategy.WeeklyReservationStrategy;

public class ReservationController {
    PaymentModeStrategy paymentModeStrategy;

    VehicleInventoryController vehicleInventoryController;

    public void bookVehicle(Vehicle vehicle, User user, ReservationType reservationType) {
        if(!vehicle.isAvailable()) System.out.println("Vehicle is unavailable");
        ReservationStrategy reservationStrategy = getReservationStrategy(reservationType);
        double price = reservationStrategy.getPrice(vehicle);
        Reservation reservation = createReservation(vehicle, user, reservationType);
        Payment payment = paymentModeStrategy.takePayment(reservation);
        if(!payment.isSuccessfull()){
            vehicleInventoryController.makeVehicleAvailable(vehicle);
        }
        reservation.setPayment(payment);
    }

    private Reservation createReservation(Vehicle vehicle, User user, ReservationType reservationType) {
        vehicleInventoryController.makeVehicleUnavailable(vehicle);
        Reservation reservation = new Reservation(vehicle, reservationType, user);
        return reservation;
    }

    public ReservationStrategy getReservationStrategy(ReservationType reservationType){
        switch (reservationType){
            case DAILY : return new DailyReservationStrategy();
            case WEEKLY: return new WeeklyReservationStrategy();
            case MONTHLY: return new MonthlyReservationStrategy();
            default:return new MonthlyReservationStrategy();
        }
    }
}
