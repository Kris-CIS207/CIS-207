import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner Scanner = new Scanner(System.in) /*scanner*/ ) {
            System.out.print("Enter the first integer: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            num2 = scanner.nextInt();
        }

        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }

    public static void displayTwiceTheNumber(int num) {
        System.out.println(num + " times 2 is " + (num * 2));
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println(num + " plus 5 is " + (num + 5));
    }

    public static void displayNumberSquared(int num) {
        System.out.println(num + " squared is " + (num * num));
    }
}