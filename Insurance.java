
import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        int birth, current_year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current year: ");
        current_year = sc.nextInt();
        System.out.println("Enter birth:");
        birth = sc.nextInt();

        int premium = calculatePremium(current_year, birth);
        System.out.println("Premium amount = "+premium);

    }

    private static int calculatePremium(int current_year, int birth) {

        int age = (current_year - birth)/10;
        int premium = (age +15)*20;
        return premium;

    }
}