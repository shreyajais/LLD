package LLD.ParkingLot.domain;

public class Vehicle {

    String liscenseNumber;
    VehicleType vehicleType;

    public Vehicle(String liscenseNumber, VehicleType vehicleType) {
        this.liscenseNumber = liscenseNumber;
        this.vehicleType = vehicleType;
    }

    public String getLiscenseNumber() {
        return liscenseNumber;
    }

    public void setLiscenseNumber(String liscenseNumber) {
        this.liscenseNumber = liscenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
