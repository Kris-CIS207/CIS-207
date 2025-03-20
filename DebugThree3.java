import java.util.Scanner;

public class DebugThree3 {

    public static void main(String[] args) { // Corrected args[] to String[] args
        String name;
        name = getName();
        displayGreeting(name);
    }

    public static String getName() { // Corrected getName() to not take void
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: "); // Added a colon for clarity
        String name = input.nextLine();
        return name;
    }

    public static void displayGreeting(String name) { // Corrected displayGreeting() to void
        System.out.println("Hello, " + name + "!"); // Corrected System.outprintln to System.out.println
    }
}
