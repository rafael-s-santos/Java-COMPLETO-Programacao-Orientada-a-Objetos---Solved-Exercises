package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ReinforcementExerciseDollarCalculator {

    public static void main(String[] args) {

        CurrencyConverter currency = new CurrencyConverter();

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("What is the dollar price: ");
        currency.price = in.nextDouble();
        System.out.print("How many dollars will be bought: ");
        currency.amount = in.nextDouble();

        double result = currency.dollarCalc(currency.price, currency.amount);

        System.out.println(currency);
        System.out.printf("Amount to be paid in reais: R$ %.2f.", result);

        in.close();

    }
}
