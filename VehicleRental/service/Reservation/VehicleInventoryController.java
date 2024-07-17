package LLD.VehicleRental.service.Reservation;

import LLD.VehicleRental.domain.VehicleDomain.Vehicle;
import LLD.VehicleRental.domain.VehicleDomain.VehicleType;

import java.util.List;

public class VehicleInventoryController {
    public List<Vehicle> getListOfAllAvailableVehicles(VehicleType vehicleType) {
        return null;
    }

    public List<String> getListOfAllBrandName() {
        return null;
    }

    public List<String> getAllCarNameForBrand(String brandName) {
        return null;
    }

    public List<Vehicle> getAllVehiclesByBrandNameAndCarName(String brandName, String carName) {
        return null;
    }

    public void makeVehicleAvailable(Vehicle vehicle) {
    }

    public void makeVehicleUnavailable(Vehicle vehicle) {
    }
}
