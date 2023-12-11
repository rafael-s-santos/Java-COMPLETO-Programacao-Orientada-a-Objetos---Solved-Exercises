import java.util.Scanner;

public class Exercise1TwoNumberAdder {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;
        
        System.out.println("Enter two integer values: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2  + ", is equal to " + sum);

        sc.close();
    }
}

