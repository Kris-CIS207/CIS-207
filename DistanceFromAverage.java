import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        final int MAX_VALUES = 15;
        final double QUIT_VALUE = 99999.0;
        double[] values = new double[MAX_VALUES];
        int count = 0;
        double sum = 0.0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter up to 15 double values (enter 99999 to quit):");
            
            while (count < MAX_VALUES) {
                System.out.print("Enter value #" + (count + 1) + ": ");
                double input = scanner.nextDouble();
                
                if (input == QUIT_VALUE) {
                    break;
                }
                
                values[count] = input;
                sum += input;
                count++;
            }
            
            if (count == 0) {
                System.out.println("Error: No values were entered.");
            } else {
                double average = sum / count;
                System.out.println("\nNumber of values entered: " + count);
                System.out.printf("Average: %.2f\n", average);
                
                System.out.println("\nValues and their distances from the average:");
                for (int i = 0; i < count; i++) {
                    double distance = Math.abs(values[i] - average);
                    System.out.printf("Value #%d: %.2f | Distance from average: %.2f\n", i + 1, values[i], distance);
                }
            }
        }
    }
}
