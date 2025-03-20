
public class MileConversions {
    public static void main(String[] args) {
        final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;
        double miles = 2.5;

        double inches = miles * INCHES_IN_MILE;
        double feet = miles * FEET_IN_MILE;
        double yards = miles * YARDS_IN_MILE;

        System.out.println(miles + " miles is equal to:");
        System.out.println(inches + " inches");
        System.out.println(feet + " feet");
        System.out.println(yards + " yards");
    }
}

