package LLD.VehicleRental.domain;

public class Pricing {
    final double weeklyPrice;
    final double dailyPrice;
    final double monthlyPrice;

    public Pricing(double weeklyPrice, double dailyPrice, double monthlyPrice) {
        this.weeklyPrice = weeklyPrice;
        this.dailyPrice = dailyPrice;
        this.monthlyPrice = monthlyPrice;
    }

    public double getWeeklyPrice() {
        return weeklyPrice;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }
}
