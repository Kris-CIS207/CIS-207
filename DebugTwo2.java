import java.util.Scanner;

public class DebugTwo2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // Create a Scanner object to read input
        ) {
            int a, b;
            System.out.print("Enter an integer >> ");
            a = scanner.nextInt(); // Use scanner to read the first integer
            System.out.print("Enter another integer >> ");
            b = scanner.nextInt(); // Use scanner to read the second integer
            System.out.println("The sum is " + (a + b));
            System.out.println("The difference is " + (a - b));
            System.out.println("The product is " + (a * b));
            // Close the scanner to prevent resource leaks
        }
    }
}