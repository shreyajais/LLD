package LLD.ParkingLot.domain.Pricing;

public class HeavyVehiclePricingStrategy implements PricingStrategy {
    @Override
    public double perHourCost() {
        return 50;
    }
}
