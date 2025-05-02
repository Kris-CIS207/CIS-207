import java.util.Scanner;

public class ArrayMethodDemo {

    public static void main(String[] args) {
        final int NUM_VALUES = 10;
        int[] numbers = new int[NUM_VALUES];
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Enter 10 integers:");
            
            for (int i = 0; i < NUM_VALUES; i++) {
                System.out.print("Enter integer #" + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
            
            System.out.println("\n--- Results ---");
            displayAll(numbers);
            displayReverse(numbers);
            displaySum(numbers);
            displayLessThanTwelve(numbers);
            displayHigherThanAverage(numbers);
        }
    }

    public static void displayAll(int[] arr) {
        System.out.println("\nAll integers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayReverse(int[] arr) {
        System.out.println("\nIntegers in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\nSum of all integers: " + sum);
    }

    public static void displayLessThanTwelve(int[] arr) {
        boolean found = false;
        System.out.println("\nValues less than 12:");
        for (int num : arr) {
            if (num < 12) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No values are less than 12.");
        } else {
            System.out.println();
        }
    }

    public static void displayHigherThanAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;

        boolean found = false;
        System.out.printf("\nAverage value: %.2f\n", average);
        System.out.println("Values higher than average:");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No values are higher than the average.");
        } else {
            System.out.println();
        }
    }
}
