package LLD.DigitalWalletSystem;

import LLD.ParkingLot.domain.payment.Payment;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DigitalWalletSystem {

    private static DigitalWalletSystem digitalWalletSystem;
    private Map<String, User> userMap;
    private Map<String, Account> accountMap;
    private Map<String, PaymentTransfer> paymentTransferMap;

    private DigitalWalletSystem() {
        this.userMap = new ConcurrentHashMap<>();
        this.accountMap = new ConcurrentHashMap<>();
        this.paymentTransferMap = new ConcurrentHashMap<>();
    }

    public synchronized DigitalWalletSystem getInstance(){
        if(digitalWalletSystem==null){
            digitalWalletSystem = new DigitalWalletSystem();
        }
        return digitalWalletSystem;
    }

    public void createUser(User user){
        this.userMap.put(user.getId(), user);
    }

    public synchronized void createAccount(Account account){
        User user = this.userMap.get(account.getUser().getId());
        user.addAccount(account);
        accountMap.put(account.getId(), account);
    }

    public Account getAccount(String accountId){
        return this.accountMap.get(accountId);
    }

    public void addPaymentTransfer(PaymentTransfer paymentTransfer){
        paymentTransferMap.put(paymentTransfer.getId(), paymentTransfer);
    }

    public PaymentTransfer getPaymentTransfer(String paymentId){
        return paymentTransferMap.get(paymentId);
    }

    public synchronized void transferFund(Account sourceAccount, Account destinationAccount, BigDecimal amount){
        Transaction newTransaction = new Transaction(sourceAccount, destinationAccount, amount);
        sourceAccount.debitAmount(amount);
        sourceAccount.addTransaction(newTransaction);
        destinationAccount.creditAmount(newTransaction.getDestinationValue().getValue());
        destinationAccount.addTransaction(newTransaction);
    }

    public List<Transaction> getTransactionHistory(Account account){
        return account.getTransactionList().values().stream().toList();
    }

}
