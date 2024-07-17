package LLD.ATM.domain.Processor;

public class TwoHundredRupeeProcessor extends WithdrawalCashProcessor{
    public TwoHundredRupeeProcessor(int count) {
        super(count);
    }


    @Override public int numberOfNotesRequired(int value) {
        return value/200;
    }


}
