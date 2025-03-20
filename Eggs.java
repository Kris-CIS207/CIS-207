
import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        // Define constants for pricing
        final double DOZEN_PRICE = 3.25;
        final double INDIVIDUAL_PRICE = 0.45;

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs in your order: ");
        int totalEggs = scanner.nextInt();

        // Calculate the number of dozens and individual eggs
        int numDozens = totalEggs / 12;
        int numIndividual = totalEggs % 12;

        // Calculate the total cost
        double totalCost = (numDozens * DOZEN_PRICE) + (numIndividual * INDIVIDUAL_PRICE);

        // Display the output
        System.out.println("You ordered " + totalEggs + " eggs.");
        System.out.println("That's " + numDozens + " dozen at $" + DOZEN_PRICE + " per dozen");
        if (numIndividual > 0) {
            System.out.println("and " + numIndividual + " loose eggs at $" + INDIVIDUAL_PRICE + " each");
        }
        System.out.printf("for a total of $%.2f%n", totalCost);
    }
}