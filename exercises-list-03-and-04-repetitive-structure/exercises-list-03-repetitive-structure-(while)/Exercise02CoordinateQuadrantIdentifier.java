import java.util.Scanner;

public class Exercise02CoordinateQuadrantIdentifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X-coordinate: ");
        int coordinateX = sc.nextInt();

        System.out.println("Enter the Y-coordinate: ");
        int coordinateY = sc.nextInt();

        while (coordinateX != 0 && coordinateY != 0) {
            if (coordinateX > 0 && coordinateY > 0) {
                System.out.println("First Quadrant");
            } else if (coordinateX < 0 && coordinateY > 0) {
                System.out.println("Second Quadrant");
            } else if (coordinateX < 0 && coordinateY < 0) {
                System.out.println("Third Quadrant");
            } else {
                System.out.println("Fourth Quadrant");
            }

            System.out.println("Enter the X-coordinate: ");
            coordinateX = sc.nextInt();

            System.out.println("Enter the Y-coordinate: ");
            coordinateY = sc.nextInt();
        }

        sc.close();
    }
}

