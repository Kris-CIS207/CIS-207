import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int days;
            double money = 0.01;
            int day = 1;
            
            System.out.print("Enter number of days >> ");
            days = keyboard.nextInt();
            
            // Use <= so we include the final day
            while(day <= days) {
                System.out.println("After day " + day + " you have $" + String.format("%.2f", money));
                money = 2 * money;  // Double the money
                ++day;
            }
        }
    }
}