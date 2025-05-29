// BankCustomer.java
class BankCustomer {
    private String customerId;
    private String customerName;
    private String customerAddress;

    public BankCustomer(String customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void pushToMainBranch() {
        System.out.println("Pushing customer data to the main branch...");
    }
}

// BankTransaction.java
class BankTransaction {
    private String bankName;
    private String accountName;
    private String accountHolderName;
    private String accountType; // saving or business
    private String accountNumber;
    private double balance;

    public BankTransaction(String bankName, String accountName, String accountHolderName, String accountType, String accountNumber, double balance) {
        this.bankName = bankName;
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void pushToBankTransactionBranch() {
        System.out.println("Pushing transaction to bank-transaction branch...");
    }
}

// Main.java
public class Main1 {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("C001", "John Doe", "123 Main St");
        customer.pushToMainBranch();

        BankTransaction transaction = new BankTransaction("SBI", "Canara Bank of Baroda", "John Doe", "Saving", "ACC123456", 5000.00);
        transaction.pushToBankTransactionBranch();

        System.out.println("Simulating GitHub push and Jenkins build every 13 minutes...");
    }
}
