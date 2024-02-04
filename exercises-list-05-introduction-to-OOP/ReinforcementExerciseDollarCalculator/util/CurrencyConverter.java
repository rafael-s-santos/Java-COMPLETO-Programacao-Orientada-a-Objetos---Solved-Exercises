package util;

public class CurrencyConverter {
    public double price;
    public double amount;

    public double dollarCalc(double price, double amount) {
        return ((price + price * 0.06) * amount);
    }

    @Override
    public String toString() {
        return String.format("CurrencyConverter:%nPirce of dollar: $ %.2f and Amount of dollars: $ %.2f.", price, amount );
    }
}
