package src.com.idk.edu01_intro;
import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            System.out.printf("Where do you live, %s? ", name);
            String address = scanner.nextLine();

            System.out.printf("Name: %s\nAddress: %s\n", name, address);
        }
    }
}
