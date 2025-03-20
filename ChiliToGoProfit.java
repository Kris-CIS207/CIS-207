import java.util.Scanner;

public class ChiliToGoProfit{

    public static void main(String[] args) {
        // Input the number of adult and child meals
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the number of adult and child meals
            System.out.print("Enter the number of adult meals sold: ");
            int adultMeals = scanner.nextInt();
            
            System.out.print("Enter the number of child meals sold: ");
            int childMeals = scanner.nextInt();
            
            // Meal prices and costs
            double adultMealPrice = 7.00;
            double adultMealCost = 4.35;
            double childMealPrice = 4.00;
            double childMealCost = 3.10;
            
            // Calculate total revenue and cost for each type of meal
            double totalAdultRevenue = adultMeals * adultMealPrice;
            double totalChildRevenue = childMeals * childMealPrice;
            double totalAdultCost = adultMeals * adultMealCost;
            double totalChildCost = childMeals * childMealCost;
            
            // Calculate profit for each type of meal
            double adultProfit = totalAdultRevenue - totalAdultCost;
            double childProfit = totalChildRevenue - totalChildCost;
            
            // Calculate grand total profit
            double grandTotalProfit = adultProfit + childProfit;
            
            // Display the results
            System.out.println("\n--- ChiliToGo Profit Analysis ---");
            System.out.printf("Adult Meals: Total Revenue = $%.2f, Total Cost = $%.2f, Profit = $%.2f\n", totalAdultRevenue, totalAdultCost, adultProfit);
            System.out.printf("Child Meals: Total Revenue = $%.2f, Total Cost = $%.2f, Profit = $%.2f\n", totalChildRevenue, totalChildCost, childProfit);
            System.out.printf("Grand Total Profit: $%.2f\n", grandTotalProfit);
        }
    }
}