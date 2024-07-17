package LLD.ATM.domain.Processor;

public class FiveHundredRupeeProcessor extends WithdrawalCashProcessor{

    public FiveHundredRupeeProcessor(int count) {
        super(count);
    }
    @Override public int numberOfNotesRequired(int value) {
        return value/500;
    }
}
