import java.util.Scanner;

public class Exercise06DivisorLister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("List Divisors");
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

