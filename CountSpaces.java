public class CountSpaces {
    public static void main(String[] args) {
        // Store your favorite inspirational quote
        String quote = "The only way to do great work is to love what you do.";

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