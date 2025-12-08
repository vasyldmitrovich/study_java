import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Input first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Input second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Input third number: ");
            double num3 = sc.nextDouble();

            double average = (num1 + num2 + num3) / 3;

            System.out.println("Average is " + average);
        }
    }
}
