Import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter an even number, or type 999 to stop.");

        while (true) {
            System.out.print("Your input: ");
            number = scanner.nextInt();

            if (number == 999) {
                System.out.println("Program ended.");
                break;
            }

            if (number % 2 == 0) {
                System.out.println("Good job!\n");
            } else {
                System.out.println("Error: That's not an even number.\n");
            }
        }

        scanner.close();
    }

    private static class Scanner {

        public Scanner() {
        }
    }
}
