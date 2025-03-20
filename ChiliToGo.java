
import java.util.Scanner;

public class ChiliToGo {

    public static void main(String[] args) {
        // Prompt the user for the number of adult meals
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for the number of adult meals
            System.out.print("Enter the number of adult meals ordered: ");
            int adultMeals = scanner.nextInt();
            
            // Prompt the user for the number of child meals
            System.out.print("Enter the number of child meals ordered: ");
            int childMeals = scanner.nextInt();
            
            // Calculate the total money collected for adult meals
            double adultTotal = adultMeals * 7.00; // Price of adult meal is $7
            
            // Calculate the total money collected for child meals
            double childTotal = childMeals * 4.00; // Price of child meal is $4
            
            // Calculate the total money collected for all meals
            double allTotal = adultTotal + childTotal;
            
            // Display the results
            System.out.println("\n--- Chili Fundraiser Results ---");
            System.out.printf("Total money collected for adult meals: $%.2f\n", adultTotal);
            System.out.printf("Total money collected for child meals: $%.2f\n", childTotal);
            System.out.printf("Total money collected for all meals: $%.2f\n", allTotal);
        }
    }
}