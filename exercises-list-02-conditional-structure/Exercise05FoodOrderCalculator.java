import java.util.Scanner;

public class Exercise05FoodOrderCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
	System.out.println("enter the product code");
        int code = sc.nextInt();
        System.out.println("enter the product code");
        int quantity = sc.nextInt();

        double total;
        if (code == 1) {
            total = quantity * 4.0;
        } else if (code == 2) {
            total = quantity * 4.5;
        } else if (code == 3) {
            total = quantity * 5.0;
        } else if (code == 4) {
            total = quantity * 2.0;
        } else {
            total = quantity * 1.5;
        }

        System.out.printf("Total: $ %.2f%n", total);

        sc.close();
    }
}

