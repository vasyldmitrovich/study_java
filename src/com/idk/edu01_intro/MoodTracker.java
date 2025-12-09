package src.com.idk.edu01_intro;
import java.util.Scanner;
import java.time.LocalTime;

public class MoodTracker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            LocalTime now = LocalTime.now();
            String greeting;

            if (now.isBefore(LocalTime.NOON)) {
                greeting = "Good morning";
            } else if (now.isBefore(LocalTime.of(18, 0))) {
                greeting = "Good afternoon";
            } else {
                greeting = "Good evening";
            }

            System.out.println(greeting + "! How are you feeling today?");
            String mood = scanner.nextLine();
            System.out.println("You are feeling " + mood + ". Thanks for sharing!");
        }
    }
}
