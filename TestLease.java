import java.util.Scanner;

class Lease {
    private String tenantName;
    private int aptNumber;
    private double rentAmount;
    private int leaseTerm;

    public Lease() {
        tenantName = "XXX";
        aptNumber = 0;
        rentAmount = 1000.0;
        leaseTerm = 12;
    }

    public Lease(String tenantName, int aptNumber, double rentAmount, int leaseTerm) {
        this.tenantName = tenantName;
        this.aptNumber = aptNumber;
        this.rentAmount = rentAmount;
        this.leaseTerm = leaseTerm;
    }


    public void addPetFee() {
        rentAmount += 100;
        System.out.println("Pet fee of $100 added to the rent.");
    }

    public void showValues() {
        System.out.println("Tenant Name: " + tenantName);
        System.out.println("Apartment Number: " + aptNumber);
        System.out.println("Rent Amount: " + rentAmount);
        System.out.println("Lease Term (months): " + leaseTerm);
        System.out.println();
    }

    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tenant name: ");
        String tenantName = scanner.nextLine();
        System.out.print("Enter apartment number: ");
        int aptNumber = scanner.nextInt();
        System.out.print("Enter rent amount: ");
        double rentAmount = scanner.nextDouble();
        System.out.print("Enter lease term (months): ");
        int leaseTerm = scanner.nextInt();
        scanner.nextLine(); 
        return new Lease(tenantName, aptNumber, rentAmount, leaseTerm);
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
}

public class TestLease {
    public static void main(String[] args) {
        Lease lease1 = Lease.getData();
        Lease lease2 = Lease.getData();
        Lease lease3 = Lease.getData();
        Lease lease4 = new Lease();

        System.out.println("Lease 1 Values:");
        lease1.showValues();

        lease1.addPetFee();

        System.out.println("Lease 1 Values After Adding Pet Fee:");
        lease1.showValues();

        System.out.println("Lease 2 Values:");
        lease2.showValues();

        System.out.println("Lease 3 Values:");
        lease3.showValues();
        
        System.out.println("Lease 4 Values (Default):");
        lease4.showValues();
    }
}