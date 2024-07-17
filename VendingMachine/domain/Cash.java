package LLD.VendingMachine.domain;

import java.util.Map;

public class Cash {
    Map<CashType, Integer> cashNoteCountMapping;

    public void increaseCount(CashType cashType, int count){
        cashNoteCountMapping.put(cashType, cashNoteCountMapping.get(cashType)+count);
    }

    public void decreaseCount(CashType cashType, int count){
        cashNoteCountMapping.put(cashType, cashNoteCountMapping.get(cashType)-count);
    }
}
