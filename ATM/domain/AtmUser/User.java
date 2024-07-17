package LLD.ATM.domain.AtmUser;

public class User {
    final Card card;
    final BankAccount bankAccount;

    public User(Card card, BankAccount bankAccount) {
        this.card = card;
        this.bankAccount = bankAccount;
    }

    public Card getCard() {
        return card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
