import java.util.Locale;
import java.util.Scanner;

public class Exercise04SalaryCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int registration;
        double hours, hourlyRate;

        System.out.println("What's your registration number?");
        registration = sc.nextInt();

        System.out.println("How many hours did you work?");
        hours = sc.nextDouble();

        System.out.println("How much do you earn per hour?");
        hourlyRate = sc.nextDouble();

        double salary = hours * hourlyRate;

        System.out.println();
        System.out.println("Registration: " + registration);
        System.out.printf("Total Salary: $%.2f%n", salary);

        sc.close();
    }
}

