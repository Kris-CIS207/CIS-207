import java.util.Scanner;

public class DebugSix2 {
    public static void main(String[] args) {
        try (var keyboard = new Scanner(System.in)) {
            char letter;
            int a;
            final int MAX = 122;
            final int NUMBERLINE = 20;
            int min;
            int lineCount = 0;
            
            System.out.println("Enter a Unicode value to start.");
            System.out.print("For example, A is 65 >> ");
            min = keyboard.nextInt();
            
            for (a = min; a <= MAX; a++) {
                letter = (char) a;
                System.out.print("  " + letter);
                lineCount++;
                
                // Start new line after every 20 characters
                if (lineCount == NUMBERLINE) {
                    System.out.println();
                    lineCount = 0;
                }
            }
            
            System.out.println("\nEnd of application");
        }
    }
}