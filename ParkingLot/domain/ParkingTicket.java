package LLD.ParkingLot.domain;

import LLD.ParkingLot.domain.payment.Payment;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
    final String id;
    final LocalDateTime startTime;
    LocalDateTime endTime;
    ParkingStatus parkingStatus;
    ParkingSpot parkingSpot;
    final String vehiclePlateNumber;
    Payment payment;

    public ParkingTicket(ParkingSpot parkingSpot, String vehiclePlateNumber) {
        this.id = UUID.randomUUID().toString();
        this.startTime = LocalDateTime.now();
        this.endTime = null;
        this.parkingStatus = ParkingStatus.CREATED;
        this.parkingSpot = parkingSpot;
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.payment = new Payment(this.parkingSpot);
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Payment getPayment() {
        return payment;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
