package LLD.VehicleRental.domain.VehicleDomain;

import LLD.VehicleRental.domain.Pricing;

import java.util.UUID;

public abstract class Vehicle {
    String id;
    Pricing pricing;
    double kmUsedSoFar;
    String brandName;
    String modelName;
    String modelYear;
    String sku;
    int count;
    boolean isAvailable;

    public Vehicle() {
    }

    public Vehicle(Pricing pricing, double kmUsedSoFar, String brandName, String modelName, String modelYear, String sku, int count, boolean isAvailable) {
        this.id = UUID.randomUUID().toString();
        this.pricing = pricing;
        this.kmUsedSoFar = kmUsedSoFar;
        this.brandName = brandName;
        this.modelYear = modelYear;
        this.modelName = modelName;
        this.sku = sku;
        this.count = count;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public double getKmUsedSoFar() {
        return kmUsedSoFar;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public String getModelName() {
        return modelName;
    }

    public String getSku() {
        return sku;
    }

    public int getCount() {
        return count;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void decreaseCount(int countDecrease) {
        this.count = count-countDecrease;
    }

    public void increaseCount(int countIncrease) {
        this.count = count-countIncrease;
    }

    public void setVehicleUnavailable() {
        isAvailable = false;
    }

    public void setVehicleAvailable() {
        isAvailable = true;
    }
}
