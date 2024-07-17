package LLD.AirlineManagementSystem.booking;

import LLD.AirlineManagementSystem.Flight;
import LLD.AirlineManagementSystem.Passenger;
import LLD.AirlineManagementSystem.seat.Seat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
    private final String id;
    private final Flight flight;
    private final Seat seat;
    private final Passenger passenger;
    private  BookingStatus bookingStatus;
    private final Double price;


    public Booking(Flight flight, Seat seat, Passenger passenger, Double price) {
        this.price = price;
        this.id = generateId(seat, flight);
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
        this.bookingStatus = BookingStatus.PENDING;
    }

    public String generateId(Seat seat, Flight flight){
        return "BKG" + seat.getId().substring(0, 4) + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
    }

    public String getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void cancelBooking(){
        this.bookingStatus = BookingStatus.CANCELLED;
    }
}
