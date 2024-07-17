package LLD.DigitalWalletSystem;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public abstract class PaymentTransfer {
    private final String id;
    private final BigDecimal amount;
    private final Currency currency;
    private final User user;

    private final Timestamp timestamp;

    protected PaymentTransfer(BigDecimal amount, Currency currency, User user) {
        this.id = amount.toString() + currency.toString() + user.getId();
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
    }

    abstract void takePayment(BigDecimal amount, Currency currency, String reference);

    public String getId() {
        return id;
    }
}
