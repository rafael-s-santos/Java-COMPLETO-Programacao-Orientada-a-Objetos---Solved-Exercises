import java.util.Scanner;

public class PasswordVerifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the password: ");
        int enteredPassword = sc.nextInt();

        while (enteredPassword != 2002) {
            System.out.println("Invalid Password");
            System.out.println("Enter the password again: ");
            enteredPassword = sc.nextInt();
        }

        System.out.println("Access Granted");

        sc.close();
    }
}

