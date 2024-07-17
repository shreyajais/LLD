package LLD.Splitwise.domain.Split;

public class EqualSplitMethod implements SplitMethod{
    @Override
    public double getSplitAmount(double transactionAmount) {
        return 0;
    }
}
