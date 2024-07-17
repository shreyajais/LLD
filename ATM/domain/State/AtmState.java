package LLD.ATM.domain.State;

import LLD.ATM.domain.AtmUser.BankAccount;
import LLD.ATM.domain.AtmUser.Card;

import java.util.List;

public abstract class AtmState {
//    IDLE,
//    INSERT_CARD,
//    AUTHORIZATION,
//    SELECT_OPERATION,
//    PROCESS_OPERATION,
//    OPERATION_COMPLETED
     public void insertCard(Card card){}

     public void authorization(Card card, BankAccount bankAccount){

     }

     public boolean checkAccountSufficientBalance(){
         return true;
     }

     public List<AtmOperations> renderOperationList(){
         return List.of(AtmOperations.values());
     }

//     public void processOperation(AtmOperations atmOperations){
//         OperationFactory.getOperation(atmOperations).process();
//     }
}
