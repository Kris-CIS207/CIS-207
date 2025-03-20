
import java.util.Scanner;

public class YummyEventPriceWithMethods {

    public static int getNumberOfGuests() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        return input.nextInt();
    }

    public static void displayMotto() {
        System.out.println("*****************************************");
        System.out.println("* Yummy Catering");
        System.out.println("*****************************************");
    }

    public static void displayEventDetails(int numberOfGuests) {
        int totalPrice = numberOfGuests * 35;
        boolean isLargeEvent = numberOfGuests >= 50;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is large event: " + isLargeEvent);
    }

    public static void main(String[] args) {
        int numberOfGuests = getNumberOfGuests();
        displayMotto();
        displayEventDetails(numberOfGuests);
    }
}