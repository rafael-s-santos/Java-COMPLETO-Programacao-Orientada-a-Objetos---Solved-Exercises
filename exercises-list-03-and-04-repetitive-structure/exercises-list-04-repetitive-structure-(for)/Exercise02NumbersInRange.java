import java.util.Scanner;

public class Exercise02NumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Count Numbers In Range");
        System.out.println("Enter the total number of values: ");
        int n = sc.nextInt();
        
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}

