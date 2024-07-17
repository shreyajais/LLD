package LLD.Splitwise.domain.Transactions;

import LLD.Splitwise.domain.Split.Split;
import LLD.Splitwise.domain.Split.SplitFactory;
import LLD.Splitwise.domain.Split.SplitMethod;
import LLD.Splitwise.domain.User;

public class SplitTransactionManager {
    public void splitTransactions(Split split){
        double transactionAmount = split.getAmount();
        SplitMethod splitMethod = SplitFactory.getSplitMethod(split.getSplitRatios());
        double splitAmount = splitMethod.getSplitAmount(transactionAmount);
        createPayerTransaction(split.getPayer(), splitAmount);
        split.getSplitGroup().forEach(user -> createBorrowerTransaction(split.getPayer(), user, splitAmount));
    }

    private void createPayerTransaction(User payer, double splitAmount) {
    }

    private void createBorrowerTransaction(User user, User user1, double splitAmount) {
    }
}
