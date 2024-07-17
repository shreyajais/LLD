package LLD.ParkingLot.service;
import LLD.ParkingLot.PaymentModeSelection.PaymentModeStrategy;
import LLD.ParkingLot.domain.*;
import LLD.ParkingLot.domain.payment.Payment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingController {

    Parking parking;
    ParkingController instance;


    public ParkingController(Parking parking) {
        this.parking = parking;
        this.instance = getInstance(parking);
    }

    public ParkingController getInstance(Parking parking){
        if(instance == null) return new ParkingController(parking);
        else return instance;
    }


    public Map<String, List<ParkingSpot>> getFreeParkingSpots(ParkingType parkingType){
        Map<String, List<ParkingSpot>> freeParkingSpots = new HashMap<>();
        parking.getFloorList().forEach(floor -> freeParkingSpots.put(floor.getName(), floor.getListOfVacantParkingSpotOfType(parkingType)));
        return freeParkingSpots;
    }

    public void createParking(ParkingSpot parkingSpot, String vehiclePlateNumber){
        ParkingTicket parkingTicket = new ParkingTicket(parkingSpot, vehiclePlateNumber);
    }

    public void completeParking(ParkingTicket parkingTicket, PaymentModeStrategy paymentModeStrategy){
        LocalDateTime endTime = LocalDateTime.now();
        double price = calculatePrice(parkingTicket, endTime);
        updateParkingTicket(parkingTicket, endTime, price);
        Payment payment = paymentModeStrategy.takePayment(parkingTicket);
        parkingTicket.setParkingStatus(ParkingStatus.PAID);
    }

    private void updateParkingTicket(ParkingTicket parkingTicket, LocalDateTime endDateTime, double price) {
        parkingTicket.setEndTime(endDateTime);
        parkingTicket.getPayment().setAmount(price);
    }

    private double calculatePrice(ParkingTicket parkingTicket, LocalDateTime endDateTime) {
        int hour = getTimeSpent(parkingTicket.getStartTime(), endDateTime);
        double price = hour * parkingTicket.getParkingSpot().getPricing().perHourCost();
        return price;
    }

    private int getTimeSpent(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        Duration duration = Duration.between(startDateTime, endDateTime);
        return (int) duration.toHours();
    }

}
