
import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        // Prompt the user for the first value
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for the first value
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();
            
            // Prompt the user for the second value
            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();
            
            // Call the computePercent() method with the values in the original order
            computePercent(number1, number2);
            
            // Call the computePercent() method with the values in reverse order
            computePercent(number2, number1);
        }
    }

    // Method to compute and display the percentage
    public static void computePercent(double num1, double num2) {
        // Calculate the percentage
        double percentage = (num1 / num2) * 100;

        // Display the values and the percentage
        System.out.printf("%.2f is %.2f percent of %.2f%n", num1, percentage, num2);
    }
}