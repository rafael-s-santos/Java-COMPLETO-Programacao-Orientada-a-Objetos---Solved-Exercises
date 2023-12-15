package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public boolean result() {
        return finalGrade() >= 60.0;
    }

    @Override
    public String toString() {
        if (result()) {
            return "FINAL GRADE: " + String.format("%.2f%n", finalGrade()) + " PASS";
        } else {
            return "FINAL GRADE: " + String.format("%.2f%n", finalGrade()) + " FAILED" + " MISSING " + String.format("%.2f", 60.00 - finalGrade());
        }
    }
}
