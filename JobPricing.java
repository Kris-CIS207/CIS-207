
import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the job name: ");
            String jobName = scanner.nextLine();
            
            System.out.print("Enter the cost of materials: ");
            double materialCost = scanner.nextDouble();
            
            System.out.print("Enter the number of hours of work required: ");
            double laborHours = scanner.nextDouble();
            
            System.out.print("Enter the number of hours of travel time: ");
            double travelHours = scanner.nextDouble();
            
            double estimatedCost = calculateEstimatedCost(materialCost, laborHours, travelHours);
            
            System.out.println("Job: " + jobName);
            System.out.println("Estimated cost: $" + String.format("%.2f", estimatedCost));
        }
    }

    public static double calculateEstimatedCost(double materialCost, double laborHours, double travelHours) {
        double laborCost = laborHours * 35;
        double travelCost = travelHours * 12;
        return materialCost + laborCost + travelCost;
    }
}