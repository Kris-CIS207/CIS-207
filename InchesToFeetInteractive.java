
import java.util.Scanner;

public class InchesToFeetInteractive {

    public static void main(String[] args) {
        // Prompt the user to enter the measurement in inches
        try ( // Create a Scanner object to read input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the measurement in inches
            System.out.print("Enter the measurement in inches: ");
            // Read the input from the user as an integer
            int inches = scanner.nextInt();
            // Calculate the number of feet and remaining inches
            int feet = inches / 12;
            int inchesLeft = inches % 12;
            // Display the result to the user
            System.out.println(inches + " inches is equal to " + feet + " feet and " + inchesLeft + " inches.");
            // Close the scanner to prevent resource leaks
        }
    }
}