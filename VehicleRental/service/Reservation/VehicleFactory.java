package LLD.VehicleRental.service.Reservation;

import LLD.VehicleRental.domain.*;
import LLD.VehicleRental.domain.VehicleDomain.*;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleFactory {
    List<Car> carList;
    List<Bike> bikeList;
    List<Bus> busList;
    public Vehicle getVehicle(VehicleType vehicleType, Pricing pricing, double kmUsedSoFar, String brandName, String modelName, String modelYear, String sku, int count, boolean isAvailable){
        switch (vehicleType){
            case CAR : return new Car(pricing, kmUsedSoFar, brandName, modelName, modelYear, sku, count, isAvailable);
            case BIKE: return new Bike(pricing, kmUsedSoFar, brandName, modelName, modelYear, sku, count, isAvailable);
            case BUS: return new Bus(pricing, kmUsedSoFar, brandName, modelName, modelYear, sku, count, isAvailable);
            default:return new Car(pricing, kmUsedSoFar, brandName, modelName, modelYear, sku, count, isAvailable);
        }
    }

    public <T extends Vehicle> List<T> getAvailableVehicle(VehicleType vehicleType){
        switch (vehicleType){
            case CAR : return (List<T>) getAvailableVehicleList(carList);
            case BIKE: return (List<T>) getAvailableVehicleList(bikeList);
            case BUS: return (List<T>) getAvailableVehicleList(busList);
            default:return (List<T>) getAvailableVehicleList(carList);
        }
    }

    private <T extends Vehicle> List<T> getAvailableVehicleList(List<T> vehicles) {
        return vehicles.stream().filter(Vehicle::isAvailable).collect(Collectors.toList());
    }


}
