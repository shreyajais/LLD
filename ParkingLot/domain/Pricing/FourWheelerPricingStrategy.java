package LLD.ParkingLot.domain.Pricing;

public class FourWheelerPricingStrategy implements PricingStrategy {
    @Override
    public double perHourCost() {
        return 40;
    }
}
