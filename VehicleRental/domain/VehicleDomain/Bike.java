package LLD.VehicleRental.domain.VehicleDomain;

import LLD.VehicleRental.domain.Pricing;
import LLD.VehicleRental.domain.VehicleDomain.Vehicle;

public class Bike extends Vehicle {

    public Bike(Pricing pricing, double kmUsedSoFar, String brandName, String carName, String modelName, String sku, int count, boolean isAvailable) {
        super(pricing, kmUsedSoFar, brandName, carName, modelName, sku, count, isAvailable);
    }
}
