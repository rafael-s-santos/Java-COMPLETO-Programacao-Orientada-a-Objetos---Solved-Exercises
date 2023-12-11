import java.util.Scanner;

public class Exercise04NonZeroDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Perform Non-Zero Division");
        System.out.println("Enter the number of test cases: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter values for test case " + (i + 1) + ":");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Division by zero is not allowed");
            } else {
                double divisionResult = (double) x / y;
                System.out.printf("Result of Division: %.1f%n", divisionResult);
            }
        }

        sc.close();
    }
}

