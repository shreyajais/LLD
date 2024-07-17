package LLD.VehicleRental;

import LLD.VehicleRental.domain.ReservationType;
import LLD.VehicleRental.domain.User;
import LLD.VehicleRental.domain.VehicleDomain.Vehicle;
import LLD.VehicleRental.service.Reservation.ReservationController;
import LLD.VehicleRental.service.Reservation.VehicleInventoryController;

import java.util.List;

public class RentalSystem {
    ReservationController reservationController;
    VehicleInventoryController vehicleInventoryController;



    public List<String> getListOfAllBrandName(){
        return vehicleInventoryController.getListOfAllBrandName();
    }

    public List<String> getAllCarNameForBrand(String brandName){
        return vehicleInventoryController.getAllCarNameForBrand(brandName);
    }

    public List<Vehicle> getAllVehiclesByBrandNameAndCarName(String brandName, String carName){
        return vehicleInventoryController.getAllVehiclesByBrandNameAndCarName(brandName, carName);
    }

    public List<Vehicle> getListOfAllAvailableVehicles(){
        return null;
        //return vehicleInventoryController.getListOfAllAvailableVehicles();
    }

    public void bookVehicle(Vehicle vehicle, User user, ReservationType reservationType){
        reservationController.bookVehicle(vehicle, user, reservationType);
    }
}
