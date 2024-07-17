package LLD.HotelManagementSystem.service;

import LLD.BookMyShow.Model.Booking;
import LLD.HotelManagementSystem.domain.Hotel;
import LLD.HotelManagementSystem.domain.Payment.Payment;
import LLD.HotelManagementSystem.domain.Room.RoomFactory;
import LLD.HotelManagementSystem.domain.Room.RoomType;

import java.util.Map;

public class HotelManager {

    Hotel hotel;
    RoomFactory roomFactory;
    Payment paymentManager;
    public boolean checkAvailability(RoomType roomType){
        return hotel.getRoomCountPerType().get(roomType) > 0;
    }

    public double getPrice(RoomType roomType){
        Integer price = roomFactory.getInstance().getRoomPrice(roomType);
        return price;
    }

    public Booking createBooking(RoomType roomType){
        if(checkAvailability(roomType)){
            double price = getPrice(roomType);
            paymentManager.takePayment(price);
            decreaseAvailable(roomType);
        } else System.out.println("Room unavailable");
        return null;
    }

    private void decreaseAvailable(RoomType roomType) {
        Map<RoomType, Integer> HotelMap = hotel.getRoomCountPerType();
        HotelMap.put(roomType, HotelMap.get(roomType)-1);
    }
}
