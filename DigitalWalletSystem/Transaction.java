package LLD.DigitalWalletSystem;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Transaction {

    private final String id;
    private final Account sourceAccount;
    private final Account destinationAccount;
    private final Money sourceValue;
    private final Money destinationValue;
    private final Timestamp timestamp;

    public Transaction(Account sourceAccount, Account destinationAccount, BigDecimal sourceValue) {
        this.id = "TXN" + sourceAccount.getId() + destinationAccount.getId() + Timestamp.valueOf(LocalDateTime.now());
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.sourceValue = new Money(sourceAccount.getCurrency(), sourceValue);
        this.destinationValue = new Money(destinationAccount.getCurrency(), getConvertedValue(sourceValue));
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
    }

    private BigDecimal getConvertedValue(BigDecimal sourceValue){
        return CurrencyConvertor.convert(sourceAccount.getCurrency(), sourceValue, destinationAccount.getCurrency());
    }

    public String getId() {
        return id;
    }

    public Money getSourceValue() {
        return sourceValue;
    }

    public Money getDestinationValue() {
        return destinationValue;
    }
}
