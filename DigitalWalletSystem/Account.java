package LLD.DigitalWalletSystem;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Account {
    private final String id;
    private final User user;
    private BigDecimal balance;

    private Currency currency;
    private boolean isActive;
    private Map<String, Transaction> transactionList;

    public Account(User user) {
        this.id = "ACCOUNT" + user.getId() + UUID.randomUUID().toString();
        this.user = user;
        this.balance = BigDecimal.ZERO;
        this.isActive = true;
        this.transactionList = new ConcurrentHashMap<>();
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public boolean isActive() {
        return isActive;
    }

    public Map<String, Transaction> getTransactionList() {
        return transactionList;
    }

    public synchronized void debitAmount(BigDecimal amount){
        if(this.balance.compareTo(amount) == -1 ) throw new InsufficientBalanceException("Balance is not sufficient!");
        else {
           this.balance.subtract(amount);
        }
    }

    public synchronized void creditAmount(BigDecimal amount){
            this.balance.add(amount);
    }

    public void addTransaction(Transaction transaction){
        this.transactionList.put(transaction.getId(), transaction);
    }
}
