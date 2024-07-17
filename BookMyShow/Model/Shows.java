package LLD.BookMyShow.Model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Shows {
    String id;
    Movie movie;
    List<showtimings> showtimings;

    Theater theater;
    Audi audi;

    LocalDateTime showDateTime;

    List<Seat> seatList;

    List<Seat> availableSeat;

    List<Seat> bookedSeat;



    // AllArgsConstructor


    public Shows(Movie movie, List<LLD.BookMyShow.Model.showtimings> showtimings, Audi audi) {
        this.id = UUID.randomUUID().toString();
        this.movie = movie;
        this.audi = audi;
        this.showtimings = getAudi().getShowTimings();
        this.showDateTime = getAudi().getShowTimings().get(0)
                .startDateTime;
        this.seatList = audi.getSeats();
        this.availableSeat = getSeatList().stream().filter(seat -> seat.isBooked== false).toList();;
        this.bookedSeat = getSeatList().stream().filter(seat -> seat.isBooked== true).toList();;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Audi getAudi() {
        return audi;
    }

    public void setAudi(Audi audi) {
        this.audi = audi;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public List<showtimings> getShowtimings(){
        return showtimings;
    }

    public List<Seat> getAvailableSeat() {
        return availableSeat;
    }


    public List<Seat> getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(Seat bookedSeat) {
        getBookedSeat().add(bookedSeat);
        getAvailableSeat().remove(bookedSeat);
    }
}
