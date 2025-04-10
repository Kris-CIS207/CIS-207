import java.util.Scanner;

public class DebugSix4 {
    public static void main(String[] args) {
        int high, low;
        int howManyBetween;
        double half, midPoint;
        try (var input = new Scanner(System.in)) {
            System.out.print("Enter a number >> ");
            low = input.nextInt();
            
            System.out.print("Enter a larger number >> ");
            high = input.nextInt();
            
            // Validate that high is actually greater than low
            while (high <= low) {
                System.out.println("The number you entered for a high number, " +
                        high + ", is not more than " + low);
                System.out.print("Enter a number higher than " + low + " >> ");
                high = input.nextInt();
            }
            
            howManyBetween = high - low;
            half = (double) howManyBetween / 2; // ensure proper division
            midPoint = low + half;
            
            System.out.println(" is halfway between " + low +
                    midPoint + " and " + high);
        }
    }
}