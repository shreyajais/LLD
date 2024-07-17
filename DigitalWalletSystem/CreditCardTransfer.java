package LLD.DigitalWalletSystem;

import java.math.BigDecimal;

public class CreditCardTransfer extends PaymentTransfer {

    private final String cardNumber;
    private final String cvv;
    private final String expire;

    protected CreditCardTransfer(BigDecimal amount, Currency currency, User reference, String cardNumber, String cvv, String expire) {
        super(amount, currency, reference);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expire = expire;
    }


    @Override
    void takePayment(BigDecimal amount, Currency currency, String reference) {
        // implementation
    }
}
