import java.util.Scanner;

public class DebugSix3 {
    public static void main(String[] args) {
        try (var keyboard = new Scanner(System.in)) {
            int userNum, val;
            final int MIN = 1;
            final int MAX = 20;
            final int TIME_WASTER = 100000;
            System.out.print("Enter a number between " + MIN + " and " + MAX + " >> ");
            userNum = keyboard.nextInt();
            // Fix input validation logic
            while (userNum < MIN || userNum > MAX) {
                System.out.println("Number out of range");
                System.out.print("Enter a number between " + MIN + " and " + MAX + " inclusive >> ");
                userNum = keyboard.nextInt();
            }   // Countdown with a time-wasting loop to simulate delay
            for (val = userNum; val > 0; --val) {
                System.out.print(val + "  ");
                
                // Simulate a short pause (simple CPU-busy loop)
                for (int x = 0; x < TIME_WASTER; ++x) {
                    for (int y = 0; y < TIME_WASTER / 100; ++y) {
                        // Busy-wait loop (not ideal, but it simulates delay)
                    }
                }
            }   System.out.println("\nBlastoff!");
        }
    }
}