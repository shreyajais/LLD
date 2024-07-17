package LLD.DigitalWalletSystem;

import java.math.BigDecimal;

public class Money {
    private final Currency currency;
    private final BigDecimal value;

    public Money(Currency currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getValue() {
        return value;
    }
}
