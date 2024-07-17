package LLD.BookMyShow.Model;

import java.util.ArrayList;
import java.util.List;

public class Audi {
    String id;
    String name;
    List<showtimings> showTimings;

    List<Seat> seats;

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    int numberOfSeats;


    public Audi(String name, int numberOfSeats) {
        this.name = name;
        this.showTimings = new ArrayList<>();
        this.numberOfSeats = numberOfSeats;
    }

    // only getter and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<showtimings> getShowTimings() {
        return showTimings;
    }

    public void setShowTimings(showtimings showTimings) {
        getShowTimings().add(showTimings);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
