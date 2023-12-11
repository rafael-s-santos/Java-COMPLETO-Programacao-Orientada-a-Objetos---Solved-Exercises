import java.util.Scanner;

public class Exercise01NumberSignChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");

        int N = sc.nextInt();
        
        System.out.println((N < 0) ? "NEGATIVE" : "NON-NEGATIVE");

        sc.close();
    }
}

