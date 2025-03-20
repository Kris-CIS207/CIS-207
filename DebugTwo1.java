import java.util.Scanner;

public class DebugTwo1 {
    public static void main(String[] args) {
        int oneInt;
        double oneDouble;
        String oneString;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer >> ");
            oneInt = input.nextInt(); // Use nextInt() to read an integer
            System.out.print("Enter a double >> ");
            oneDouble = input.nextDouble(); // Use nextDouble() to read a double
            input.nextLine(); // Consume the newline character left by nextInt() and nextDouble()
            System.out.print("Enter a string >> ");
            oneString = input.nextLine();
            System.out.print("The int is ");
            System.out.println(oneInt); // Corrected print statement
            System.out.print("The double is ");
            System.out.println(oneDouble); // Corrected print statement
            System.out.print("The String is ");
            System.out.println(oneString); // Corrected print statement
            // Close the scanner object
        }
    }
}