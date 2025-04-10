import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        // Prompt the user to enter a quote
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a quote
            System.out.print("Enter a quote: ");
            String quote = scanner.nextLine();
            
            // Variable to store the number of spaces
            int spaceCount = 0;
            
            // Loop through each character in the string and check if it's a space
            for (int i = 0; i < quote.length(); i++) {
                if (quote.charAt(i) == ' ') {
                    spaceCount++;
                }
            }
            
            // Display the total number of spaces
            System.out.println("The total number of spaces in the quote is: " + spaceCount);
        }
    }
}