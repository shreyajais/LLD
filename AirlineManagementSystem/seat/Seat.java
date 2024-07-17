package LLD.AirlineManagementSystem.seat;

import java.util.UUID;

public class Seat {
    private final String id;
    private final String name;
    private final SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(String id, String name, SeatType seatType, SeatStatus seatStatus) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.seatType = seatType;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public void reserveSeat(){
        this.seatStatus = SeatStatus.RESERVED;
    }

    public String getId() {
        return id;
    }

    public void makeSeatAvailable(){
        this.seatStatus = SeatStatus.AVAILABLE;
    }
}
