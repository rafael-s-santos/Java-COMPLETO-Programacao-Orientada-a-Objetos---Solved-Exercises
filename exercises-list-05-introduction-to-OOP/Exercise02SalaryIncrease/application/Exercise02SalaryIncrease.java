package application;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02SalaryIncrease {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputScanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("- Salary Update -");

        System.out.println("Enter the employee name:");
        employee.name = inputScanner.nextLine();

        System.out.println("Enter the employee gross salary:");
        employee.grossSalary = inputScanner.nextDouble();

        System.out.println("Enter the tax:");
        employee.tax = inputScanner.nextDouble();

        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.println("Enter the salary update in %:");
        double percentage = inputScanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println(employee);

	
	inputScanner.close();

    }
}
