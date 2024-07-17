package LLD.AirlineManagementSystem;

import LLD.AirlineManagementSystem.seat.Seat;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Flight {
    private final String id;
    private final String source;
    private final String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private final List<Seat> seatList;
    private int availableSeats;

    public Flight(String sourceTime, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, List<Seat> seatList, int availableSeats) {
        this.source = source;
        this.id = "FLY" + UUID.randomUUID().toString();
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatList = seatList;
        this.availableSeats = availableSeats;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    public void decreaseAvailableSeats(){
        this.availableSeats--;
    }
    public void increaseAvailableSeats(){

    }
}
