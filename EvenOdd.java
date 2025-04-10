import java.util.Scanner;

public class EvenOdd {

    // Method to determine if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Ask the user to enter an integer
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user to enter an integer
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
            
            // Call the isEven method and store the result
            boolean result = isEven(userInput);
            
            // Display the result
            if (result) {
                System.out.println(userInput + " is even.");
            } else {
                System.out.println(userInput + " is odd.");
            }
        }
    }
} 