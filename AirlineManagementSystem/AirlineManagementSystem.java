package LLD.AirlineManagementSystem;

import LLD.AirlineManagementSystem.booking.Booking;
import LLD.AirlineManagementSystem.seat.Seat;
import LLD.LibraryManagementSystem.domain.Book;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class AirlineManagementSystem {

    private static AirlineManagementSystem airlineManagementSystem;
    private List<Flight> flightList;
    private Map<String, Booking> bookingList;

    private AirlineManagementSystem() {
        this.flightList = new ArrayList<>();
        this.bookingList = new ConcurrentHashMap<>();
    }

    public static AirlineManagementSystem getInstance(){
        if(airlineManagementSystem==null) airlineManagementSystem = new AirlineManagementSystem();
        return airlineManagementSystem;
    }

    public List<Flight> searchFlight(String source, String destination, LocalDateTime localDateTime){
        return flightList.stream().filter(flight ->
                flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination) &&
                        flight.getDepartureTime().toLocalDate().equals(localDateTime.toLocalDate())
        ).collect(Collectors.toList());
    }

    public void addFlight(Flight flight){
        this.flightList.add(flight);
    }

    public synchronized Booking createBooking(Flight flight, Seat seat, Passenger passenger, Double price){
        Booking booking = new Booking(flight, seat, passenger, price);
        seat.reserveSeat();
        flight.decreaseAvailableSeats();
        bookingList.put(booking.getId(), booking);
        return booking;
    }

    public synchronized void cancelBooking(Booking booking){
        booking.cancelBooking();
        booking.getSeat().makeSeatAvailable();
        booking.getFlight().increaseAvailableSeats();
    }
}
