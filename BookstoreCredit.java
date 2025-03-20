
import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {
        // Prompt the user for the student's name
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user for the student's name
            System.out.print("Enter the student's name: ");
            String studentName = input.nextLine();
            
            // Prompt the user for the student's GPA
            System.out.print("Enter the student's GPA: ");
            double studentGpa = input.nextDouble();
            
            // Calculate the bookstore credit
            double bookstoreCredit = studentGpa * 10;
            
            // Display the descriptive message
            displayMessage(studentName, studentGpa, bookstoreCredit);
        }
    }

    // Method to display the descriptive message
    public static void displayMessage(String studentName, double studentGpa, double bookstoreCredit) {
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("GPA: " + studentGpa);
        System.out.println("Bookstore Credit: $" + bookstoreCredit);
    }
}