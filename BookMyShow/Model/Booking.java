package LLD.BookMyShow.Model;

import LLD.BookMyShow.Model.Enums.SeatType;
import LLD.BookMyShow.Model.Payment.Invoice;

import java.util.List;

public class Booking {

    String id;
    String userId;
    Shows shows;
    List<Seat> seats;
    boolean isPaid;
    Invoice invoice;
    String paymentId;


    public void createBooking(List<Seat> seats, Shows shows){
        // creates booking
        calculateCost();
    }

    public double calculateCost(){
        // calculate cost of all seats;
        return 0;
    }
}
