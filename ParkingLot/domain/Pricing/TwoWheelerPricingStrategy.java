package LLD.ParkingLot.domain.Pricing;

public class TwoWheelerPricingStrategy implements PricingStrategy {
    @Override
    public double perHourCost() {
        return 20;
    }
}
