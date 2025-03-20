
import java.util.Scanner;

public class FormLetterWriter {

    // Overloaded method 1: Takes one String (first name)
    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.");
    }

    // Overloaded method 2: Takes two Strings (first and last name)
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user for a last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Test the overloaded methods
        System.out.println("\nTesting overloaded methods:");
        System.out.println("Method 1 (single name):");
        displaySalutation(firstName); // Call with one parameter

        System.out.println("\nMethod 2 (first and last name):");
        displaySalutation(firstName, lastName); // Call with two parameters
    }
}