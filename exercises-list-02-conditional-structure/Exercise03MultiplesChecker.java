import java.util.Scanner;

public class Exercise03MultiplesChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of A and B: ")

        int A = sc.nextInt();
        int B = sc.nextInt();

        String result = (A % B == 0 || B % A == 0) ? "They are Multiples" : "They are Not Multiples";

        System.out.println(result);

        sc.close();
    }
}

