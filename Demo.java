// Interface definition
interface BankInterface {
    double getBalance(); // Method to get the balance
    double getInterestRate(); // Method to get the interest rate
}

// Implementation for BankA
class BankA implements BankInterface {
    private double balance;

    // Constructor to set the balance
    public BankA(double balance) {
        this.balance = balance;
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement getInterestRate method
    @Override
    public double getInterestRate() {
        return 7.0; // BankA offers 7% interest
    }
}

// Implementation for BankB
class BankB implements BankInterface {
    private double balance;

    // Constructor to set the balance
    public BankB(double balance) {
        this.balance = balance;
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement getInterestRate method
    @Override
    public double getInterestRate() {
        return 7.4; // BankB offers 7.4% interest
    }
}

// Implementation for BankC
class BankC implements BankInterface {
    private double balance;

    // Constructor to set the balance
    public BankC(double balance) {
        this.balance = balance;
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement getInterestRate method
    @Override
    public double getInterestRate() {
        return 7.9; // BankC offers 7.9% interest
    }
}

// Main class to test the implementation
public class Demo {
    public static void main(String[] args) {
        // Create objects of each bank with the specified deposit amounts
        BankA bankA = new BankA(10000);
        BankB bankB = new BankB(150000);
        BankC bankC = new BankC(200000);

        // Display balance and interest rate for each bank
        System.out.println("BankA:");
        System.out.println("Balance: " + bankA.getBalance());
        System.out.println("Interest Rate: " + bankA.getInterestRate() + "%");

        System.out.println("\nBankB:");
        System.out.println("Balance: " + bankB.getBalance());
        System.out.println("Interest Rate: " + bankB.getInterestRate() + "%");

        System.out.println("\nBankC:");
        System.out.println("Balance: " + bankC.getBalance());
        System.out.println("Interest Rate: " + bankC.getInterestRate() + "%");
    }
}
