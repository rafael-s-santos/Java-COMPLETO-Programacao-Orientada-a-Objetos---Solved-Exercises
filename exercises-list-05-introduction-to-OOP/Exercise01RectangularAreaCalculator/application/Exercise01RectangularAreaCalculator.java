package application;
import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Exercise01RectangularAreaCalculator {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputScanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Calculating rectangle area");

        System.out.println("Enter the value of width:");
        rectangle.width = inputScanner.nextDouble();

        System.out.println("Enter the value of height: ");
        rectangle.height = inputScanner.nextDouble();

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.diagonal();

        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perimeter);
        System.out.println("Rectangle diagonal: " + diagonal);

        inputScanner.close();
    }
}
