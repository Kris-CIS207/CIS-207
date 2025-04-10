import java.util.Scanner;

public class BabyNameComparison {

    public static void main(String[] args) {
        // Prompt the user for three names
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for three names
            System.out.println("Enter three first names:");
            String name1 = scanner.nextLine();
            String name2 = scanner.nextLine();
            String name3 = scanner.nextLine();
            
            // Display all possible two-name combinations
            System.out.println("\nPossible two-name combinations:");
            System.out.println(name1 + " " + name2);
            System.out.println(name1 + " " + name3);
            System.out.println(name2 + " " + name1);
            System.out.println(name2 + " " + name3);
            System.out.println(name3 + " " + name1);
            System.out.println(name3 + " " + name2);
        }
    }
}