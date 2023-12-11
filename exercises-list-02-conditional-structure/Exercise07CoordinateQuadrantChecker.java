import java.util.Locale;
import java.util.Scanner;

public class Exercise07CoordinateQuadrantChecker {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X-coordinate on the Cartesian plane: ");
        double x = sc.nextDouble();

        System.out.println("Enter the Y-coordinate on the Cartesian plane: ");
        double y = sc.nextDouble();

        if (x > 0) {
            if (y > 0) {
                System.out.println("The point is in quadrant Q1.");
            } else if (y < 0) {
                System.out.println("The point is in quadrant Q4.");
            } else {
                System.out.println("The point is on the positive side of the X-Axis.");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("The point is in quadrant Q2.");
            } else if (y < 0) {
                System.out.println("The point is in quadrant Q3.");
            } else {
                System.out.println("The point is on the negative side of the X-Axis.");
            }
        } else {
            if (y != 0) {
                System.out.println("The point is on the positive side of the Y-Axis.");
            } else {
                System.out.println("The point is at the central origin: (0,0).");
            }
        }

        sc.close();
    }
}

