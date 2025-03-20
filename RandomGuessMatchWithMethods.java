
import java.util.Scanner;

public class RandomGuessMatchWithMethods {

    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;

        // Generate a random number
        int randomNumber = MIN + (int) (Math.random() * (MAX - MIN + 1));

        // Get the user's guess
        int userGuess = getUserGuess(MIN, MAX);

        // Check if the user guessed correctly
        boolean guessedCorrectly = (userGuess == randomNumber);

        // Display the results
        displayResults(randomNumber, userGuess, guessedCorrectly);
    }

    // Method to get the user's guess
    public static int getUserGuess(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between " + min + " and " + max + ": ");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                if (guess >= min && guess <= max) {
                    return guess;
                } else {
                    System.out.println("Please enter a number within the specified range.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
        }
    }

    // Method to display the results
    public static void displayResults(int randomNumber, int userGuess, boolean guessedCorrectly) {
        System.out.println("\nThe random number was: " + randomNumber);
        System.out.println("Your guess was: " + userGuess);

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed it correctly!");
        } else {
            int distance = Math.abs(userGuess - randomNumber);
            System.out.println("You were " + distance + " away from the random number.");
        }
    }
}