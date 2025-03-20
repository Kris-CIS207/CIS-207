
import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a value in inches: ");
            double inches = scanner.nextDouble();
            
            inchesToFeet(inches);
            inchesToYards(inches);
        }
    }

    public static void inchesToFeet(double inches) {
        double feet = inches / 12;
        System.out.println(inches + " inches is equal to " + feet + " feet.");
    }

    public static void inchesToYards(double inches) {
        double yards = inches / 36;
        System.out.println(inches + " inches is equal to " + yards + " yards.");
    }
}