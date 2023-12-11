import java.util.Scanner;

public class Exercise03FuelTypeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        System.out.println("Fuel Type Counter");
        System.out.println("Enter the fuel type: Alcohol [1], Gasoline [2], Diesel [3], Exit [4]");

        int type = sc.nextInt();

        while (type != 4) {
            if (type == 1) {
                alcohol++;
            } else if (type == 2) {
                gasoline++;
            } else if (type == 3) {
                diesel++;
            }

            System.out.println("Enter the fuel type: Alcohol [1], Gasoline [2], Diesel [3], Exit [4]");
            type = sc.nextInt();
        }

        System.out.println("THANK YOU");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}

