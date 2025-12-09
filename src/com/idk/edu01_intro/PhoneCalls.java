package src.com.idk.edu01_intro;
import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double[] costs = new double[3];
            double totalCost = 0;

            for (int i = 0; i < 3; i++) {
                System.out.printf("Enter cost per minute for call %d: ", i + 1);
                double costPerMinute = scanner.nextDouble();

                System.out.printf("Enter duration in minutes for call %d: ", i + 1);
                double duration = scanner.nextDouble();

                costs[i] = costPerMinute * duration;
                totalCost += costs[i];
            }

            for (int i = 0; i < 3; i++) {
                System.out.printf("Cost of call %d: %.2f\n", i + 1, costs[i]);
            }

            System.out.printf("Total cost: %.2f\n", totalCost);
        }
    }
}
