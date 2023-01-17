package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double currencyConverter(double dolarPrice, double amount) {
        return dolarPrice * amount * (1 + IOF);
    }

}
