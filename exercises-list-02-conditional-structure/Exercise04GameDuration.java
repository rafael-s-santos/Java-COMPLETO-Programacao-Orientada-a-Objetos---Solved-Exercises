import java.util.Scanner;

public class Exercise04GameDuration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the initial hour: ");
        int initialHour = sc.nextInt();
        System.out.println("Enter the final hour: ");
        int finalHour = sc.nextInt();

        int duration = (initialHour < finalHour) ? (finalHour - initialHour) : (24 - initialHour + finalHour);

        System.out.println("THE GAME LASTED " + duration + " HOUR(S)");

        sc.close();
    }
}

