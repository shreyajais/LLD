package LLD.ParkingLot.domain;

import LLD.ParkingLot.domain.Pricing.FourWheelerPricingStrategy;
import LLD.ParkingLot.domain.Pricing.HeavyVehiclePricingStrategy;
import LLD.ParkingLot.domain.Pricing.PricingStrategy;
import LLD.ParkingLot.domain.Pricing.TwoWheelerPricingStrategy;

public class ParkingSpot {
    final String id;
    ParkingType parkingType;
    PricingStrategy pricing;
    boolean isVacant;

    public ParkingSpot(String id, ParkingType parkingType, PricingStrategy pricing, boolean isVacant) {
        this.id = id;
        this.parkingType = parkingType;
        this.pricing = pricing;
        this.isVacant = isVacant;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public PricingStrategy getPricing() {
        return pricing;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public void setPricing(ParkingType parkingType) {
       switch (parkingType){
           case TWO_WHEELER : pricing = new TwoWheelerPricingStrategy();
           case FOUR_WHEELER: pricing = new FourWheelerPricingStrategy();
           case HEAVY_VEHICLE: pricing = new HeavyVehiclePricingStrategy();
           default: pricing = new FourWheelerPricingStrategy();
       }
    }

    public void setVacant(boolean vacant) {
        isVacant = vacant;
    }
}
