public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private String email;
    private String phone;

    // Constructor
    public Account(int accountNumber, String holderName, double balance, String email, String phone) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } else if(amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public void updateContactDetails(String email, String phone) {
        if(email.contains("@") && phone.matches("\\d{10}")) {
            this.email = email;
            this.phone = phone;
            System.out.println("Contact details updated successfully!");
        } else {
            System.out.println("Invalid email or phone number.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
