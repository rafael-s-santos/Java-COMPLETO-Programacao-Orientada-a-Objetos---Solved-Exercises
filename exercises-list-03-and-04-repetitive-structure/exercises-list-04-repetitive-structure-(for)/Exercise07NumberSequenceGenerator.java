import java.util.Scanner;

public class Exercise07NumberSequenceGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Generate Number Sequences");
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int first = i;
            int second = i * i;
            int third = i * i * i;
            System.out.printf("%d %d %d%n", first, second, third);
        }

        sc.close();
    }
}

