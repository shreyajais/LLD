package LLD.ATM.domain.Processor;

public class HundredRupeeProcessor extends WithdrawalCashProcessor{

    public HundredRupeeProcessor(int count) {
        super(count);
    }
    @Override public int numberOfNotesRequired(int value) {
        return value/100;
    }
}
