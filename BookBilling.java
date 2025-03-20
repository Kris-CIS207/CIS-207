
import java.util.Scanner;

public class BookBilling {

    static final double PRICE = 14.99;
    static final double TAX_RATE = 0.08;

    public double computeBill() {
        return PRICE * (1 + TAX_RATE);
    }

    public double computeBill(int quantity) {
        return quantity * PRICE * (1 + TAX_RATE);
    }

    public double computeBill(int quantity, double coupon) {
        double priceAfterCoupon = (quantity * PRICE) - coupon;
        return priceAfterCoupon * (1 + TAX_RATE);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of books ordered: ");
            int quantity = scanner.nextInt();
            
            System.out.print("Enter the coupon value: ");
            double coupon = scanner.nextDouble();
            
            BookBilling billing = new BookBilling();
            
            System.out.println("Bill for one book: $" + String.format("%.2f", billing.computeBill()));
            System.out.println("Bill for " + quantity + " books: $" + String.format("%.2f", billing.computeBill(quantity)));
            System.out.println("Bill for " + quantity + " books with coupon: $" + String.format("%.2f", billing.computeBill(quantity, coupon)));
        }
    }
}