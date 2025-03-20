public class Lease {

    // Fields
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTermMonths;

    // Default constructor
    public Lease() {
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000.00;
        this.leaseTermMonths = 12;
    }

    // Getter methods
    public String getTenantName() {
        return tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public int getLeaseTermMonths() {
        return leaseTermMonths;
    }

    // Setter methods
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setLeaseTermMonths(int leaseTermMonths) {
        this.leaseTermMonths = leaseTermMonths;
    }

    // Non-static method to add pet fee
    public void addPetFee() {
        this.monthlyRent += 10.00;
        explainPetPolicy();
    }

    // Static method to explain pet policy
    public static void explainPetPolicy() {
        System.out.println("A pet fee of $10 is added to the monthly rent.");
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        Lease lease1 = new Lease();
        System.out.println("Initial Rent: $" + lease1.getMonthlyRent());

        lease1.addPetFee();
        System.out.println("Rent with pet fee: $" + lease1.getMonthlyRent());
    }
}