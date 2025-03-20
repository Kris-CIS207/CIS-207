
import java.util.Scanner;

public class MadLibWithMethod {

    public static void main(String[] args) {
        // Prompt the user for words
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for words
            System.out.print("Enter an animal: ");
            String animal = scanner.nextLine();
            System.out.print("Enter a number: ");
            String number = scanner.nextLine();
            System.out.print("Enter a direction: ");
            String direction = scanner.nextLine();
            
            // Call the method to display the Mad Lib
            displayMadLib(animal, number, direction);
        }
    }

    // Method to display the Mad Lib
    public static void displayMadLib(String animal, String number, String direction) {
        System.out.println("Hickory Dickory Dock,");
        System.out.println("The " + animal + " ran up the clock,");
        System.out.println("The clock struck " + number + ",");
        System.out.println("The " + animal + " ran " + direction + ",");
        System.out.println("Hickory Dickory Dock.");
    }
}