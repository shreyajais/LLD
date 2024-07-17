package LLD.DigitalWalletSystem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConvertor {

    private static final Map<Currency, BigDecimal> currencyValue = new HashMap<>();;

    public CurrencyConvertor() {
        this.currencyValue.put(Currency.AED, new BigDecimal(22.74));
        this.currencyValue.put(Currency.DOLLAR, new BigDecimal(83.51));
        this.currencyValue.put(Currency.POUND, new BigDecimal(106.95));
        this.currencyValue.put(Currency.JYP, new BigDecimal(161.51));
        this.currencyValue.put(Currency.INR, new BigDecimal(1));
        this.currencyValue.put(Currency.RYD, new BigDecimal(22.27));
    }

    public static BigDecimal convert(Currency from, BigDecimal value, Currency to){
        if(from == to) return value;
        else return currencyValue.get(from).multiply(value).divide(currencyValue.get(to), RoundingMode.HALF_UP);
    }

}
