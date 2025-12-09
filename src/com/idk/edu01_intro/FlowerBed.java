package src.com.idk.edu01_intro;
import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the radius of the flower bed: ");
            double radius = scanner.nextDouble();

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.printf("Perimeter: %.2f\n", perimeter);
            System.out.printf("Area: %.2f\n", area);
        }
    }
}
