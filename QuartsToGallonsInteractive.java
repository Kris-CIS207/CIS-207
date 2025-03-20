import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of quarts needed >> ");
        int quartsNeeded = input.nextInt();
        int gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        int extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts.");
    }
}