package LLD.Splitwise.domain.Transactions;

import LLD.Splitwise.domain.AbstractTimelineEntity;
import LLD.Splitwise.domain.Enums.SplitType;
import LLD.Splitwise.domain.User;

public class Transaction extends AbstractTimelineEntity {
    String id;
    Double amount;
    SplitType splitType;

    User payer;
    User user;
    TransactionStatus transactionStatus;

    public Transaction(User updatedBy) {
        super(updatedBy);
    }

    public String getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public User getUser() {
        return user;
    }

    public User getPayer() {
        return payer;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }
}


