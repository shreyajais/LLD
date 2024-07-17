package LLD.DigitalWalletSystem;

import java.math.BigDecimal;

public class AccountTransfer extends PaymentTransfer{

    private final String accountNo;
    private final String bankName;
    private final String wireNo;
    protected AccountTransfer(BigDecimal amount, Currency currency, User reference, String accountNo, String bankName, String wireNo) {
        super(amount, currency, reference);
        this.accountNo = accountNo;
        this.bankName = bankName;
        this.wireNo = wireNo;
    }

    @Override
    void takePayment(BigDecimal amount, Currency currency, String reference) {

    }
}
