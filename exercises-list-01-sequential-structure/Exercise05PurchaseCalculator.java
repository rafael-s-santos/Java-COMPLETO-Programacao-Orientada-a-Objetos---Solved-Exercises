import java.util.Locale;
import java.util.Scanner;

public class Exercise05PurchaseCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, code2, quantity1, quantity2;
        double price1, price2, total;'
        
        System.out.println("Enter the code, quantity and price of part 1: ");

        code1 = sc.nextInt();
        quantity1 = sc.nextInt();
        price1 = sc.nextDouble();
        
        System.out.println("Enter the code, quantity and price of part 2: ");

        code2 = sc.nextInt();
        quantity2 = sc.nextInt();
        price2 = sc.nextDouble();

        total = price1 * quantity1 + price2 * quantity2;

        System.out.printf("TOTAL TO PAY: $ %.2f%n", total);

        sc.close();
    }
}

