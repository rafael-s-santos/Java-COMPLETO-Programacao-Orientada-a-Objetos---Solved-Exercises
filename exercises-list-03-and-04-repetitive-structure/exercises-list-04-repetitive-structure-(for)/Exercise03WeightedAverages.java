import java.util.Locale;
import java.util.Scanner;

public class Exercise03WeightedAverages {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate Weighted Averages");
        System.out.println("Enter the number of test cases: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter values for test case " + (i + 1) + ":");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double weightedAverage = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("Weighted Average: %.1f%n", weightedAverage);
        }

        sc.close();
    }
}

