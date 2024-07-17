package LLD.Splitwise.domain.Split;

public class PercentageSplitMethod implements SplitMethod{
    @Override
    public double getSplitAmount(double transactionAmount) {
        return 0;
    }
}
