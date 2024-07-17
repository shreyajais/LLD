package LLD.ParkingLot;

import LLD.ParkingLot.PaymentModeSelection.PaymentModeStrategy;
import LLD.ParkingLot.domain.*;
import LLD.ParkingLot.service.ParkingController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLotSystem {

    ParkingLotSystem instance;
    ParkingController parkingController;
    List<Parking> parkingList;

    public ParkingLotSystem() {
        this.instance = getInstance();
        this.parkingController = new ParkingController();
        this.parkingList = new ArrayList<>();
    }

    public ParkingLotSystem getInstance(){
        if(instance==null) return new ParkingLotSystem();
        else return instance;
    }

    public Vehicle getVehicle(String liscence, VehicleType vehicleType){
        return new Vehicle(liscence, vehicleType);
    }

    public  Map<String, List<ParkingSpot>> getParkingSpotsForEachFloor(Parking parking, Vehicle vehicle ){
        ParkingController parkingController = parkingController.getInstance(parking);
        ParkingType parkingType = getParkingTypeForVehicle(vehicle.getVehicleType());
        Map<String, List<ParkingSpot>> freeParkingSpot = parkingController.getFreeParkingSpots(parkingType);
        return freeParkingSpot;
    }

    public void bookParkingSpot(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingController.createParking(parkingSpot, vehicle.getLiscenseNumber());
    }

    public void completeParkingSpot(ParkingTicket parkingTicket, PaymentModeStrategy paymentModeStrategy){
        parkingController.completeParking(parkingTicket, paymentModeStrategy);
    }

    public ParkingType getParkingTypeForVehicle(VehicleType vehicleType){
        switch(vehicleType){
            case BIKE : return ParkingType.TWO_WHEELER;
            case SCOOTY:return ParkingType.TWO_WHEELER;
            case CAR: return ParkingType.FOUR_WHEELER;
            case BUS: return ParkingType.HEAVY_VEHICLE;
            case TRUCK:return ParkingType.HEAVY_VEHICLE;
            default:return ParkingType.FOUR_WHEELER;
        }
    }

}
