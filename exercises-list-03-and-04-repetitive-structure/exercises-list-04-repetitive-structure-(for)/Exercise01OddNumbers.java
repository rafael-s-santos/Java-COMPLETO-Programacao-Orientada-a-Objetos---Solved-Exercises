import java.util.Scanner;

public class Exercise01OddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Odd Numbers Up To X");
        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();
        
        System.out.println("Odd numbers up to " + x + ":");
        
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

