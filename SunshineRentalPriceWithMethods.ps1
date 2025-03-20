import java.util.Scanner;
public class  SunshineRentalPriceWithMethods {
   public static void main(String[] args) {
System.out.println("Enter number of minutes you rented a piece of sports"
               + " equipment");
       Scanner scan = new Scanner(System.in);
       int minutesRented = scan.nextInt();
       int minutesInHour = 60;
       System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n"
                 + "S “Sammy’s makes it fun in the sun.” S\n"
                 + "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
       System.out.println("Rental cost is: $" + 
           ((minutesRented/minutesInHour)*40+(minutesRented%minutesInHour)*1));
   }
}