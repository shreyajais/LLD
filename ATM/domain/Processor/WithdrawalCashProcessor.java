package LLD.ATM.domain.Processor;

public abstract class WithdrawalCashProcessor {
    int count;

    public WithdrawalCashProcessor(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public boolean isSufficient(int value) {
        return count > numberOfNotesRequired(value);
    }

    public int numberOfNotesRequired(int value) {
        return value;
    }

    public void deduct(int numberOfNotes) {
        count-= numberOfNotes;
    }
}
