import java.util.Scanner;

public class MathEnhancer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter integer a: ");
            int a = scanner.nextInt();

            System.out.print("Enter integer b: ");
            int b = scanner.nextInt();

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));

            if (b != 0) {
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b)); // Modulo operation
            } else {
                System.out.println("Division and modulo by zero are undefined.");
            }

            System.out.println("a ^ b = " + Math.pow(a, b)); // Power operation
        }
    }
}
