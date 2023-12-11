import java.util.Scanner;

public class Exercise2EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        String parity = (number % 2 == 0) ? "EVEN" : "ODD";
        
        System.out.println("The entered number is " + number + ", which is an " + parity + " number.");

        sc.close();
    }
}

