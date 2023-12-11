import java.util.Locale;
import java.util.Scanner;

public class Exercise06GeometricCalculations {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, circle, trapezoid, square, rectangle;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangle = A * C / 2.0;
        circle = 3.14159 * C * C;
        trapezoid = (A + B) / 2.0 * C;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGLE: %.3f%n", triangle);
        System.out.printf("CIRCLE: %.3f%n", circle);
        System.out.printf("TRAPEZOID: %.3f%n", trapezoid);
        System.out.printf("SQUARE: %.3f%n", square);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }
}

