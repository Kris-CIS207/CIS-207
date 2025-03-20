
import java.util.Scanner;

class Sandwich {
    private final String mainIngredient;
    private final String breadType;
    private final double price;

    public Sandwich(String mainIngredient, String breadType, double price) {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "mainIngredient='" + mainIngredient + '\'' +
                ", breadType='" + breadType + '\'' +
                ", price=" + price +
                '}';
    }
}

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for sandwich data
        System.out.print("Enter main sandwich ingredient: ");
        String mainIngredient = scanner.nextLine();

        System.out.print("Enter bread type: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter sandwich price: ");
        double price = scanner.nextDouble();

        // Create a Sandwich object
        Sandwich sandwich = new Sandwich(mainIngredient, breadType, price);

        // Display the sandwich details
        System.out.println("\nYou have ordered a " + sandwich.toString() + ".");
    }
}