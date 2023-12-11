import java.util.Locale;
import java.util.Scanner;

public class Exercise02CircleAreaCalculator {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double radius, area, pi = 3.14159;
        
        System.out.print("Enter the radius of the circle: ");
        
        radius = sc.nextDouble();
        
        area = pi * radius * radius;
        
        System.out.printf("The area of the circle is %.4f%n", area);
        sc.close();
    }
}

