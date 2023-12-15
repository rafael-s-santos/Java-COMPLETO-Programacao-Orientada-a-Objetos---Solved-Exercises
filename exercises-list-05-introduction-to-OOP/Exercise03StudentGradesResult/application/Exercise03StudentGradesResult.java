package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Exercise03StudentGradesResult {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = in.nextLine();

        System.out.print("Enter grade 1: ");
        student.grade1 = in.nextDouble();

        System.out.print("Enter grade 2: ");
        student.grade2 = in.nextDouble();

        System.out.print("Enter grade 3: ");
        student.grade3 = in.nextDouble();

        System.out.println(student.toString());

        in.close();
    }
}
