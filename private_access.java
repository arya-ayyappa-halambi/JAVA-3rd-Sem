// Save this entire code into your Main.java file

class BankAccount {
    // 1. Private variables - hidden from the outside world
    private String accountHolder;
    private double balance;

    // Constructor to initialize data
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 2. Public GETTER method to safely read the private balance
    public double getBalance() {
        return this.balance;
    }

    // 3. Public SETTER method to safely modify the private balance with validation
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // 4. A private helper method - cannot be called from outside this class
    private void logTransaction(String action) {
        System.out.println("[LOG] " + action + " for " + accountHolder);
    }

    // Public method that uses the internal private method
    public void printStatement() {
        logTransaction("Printed Statement"); // Allowed: item is inside the same class
        System.out.println("Account Holder: " + accountHolder + " | Balance: $" + balance);
    }
}

public class private_access {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Arya", 1000.0);

        System.out.println("--- Using Public Getters and Setters ---");
        // Reading private data via public getter
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Modifying private data via public setter
        myAccount.deposit(500.0);
        System.out.println("New Balance: $" + myAccount.getBalance());

        System.out.println("\n--- Testing Direct Access (What fails) ---");
        
        /* 
         * UNCOMMENTING THE LINES BELOW WILL CAUSE A COMPILE-TIME ERROR
         * Just like your previous "cannot be resolved" error, the compiler stops this.
         */
        // myAccount.balance = 50000.0;       // ERROR: balance has private access in BankAccount
        // myAccount.logTransaction("Hack");   // ERROR: logTransaction() has private access in BankAccount

        System.out.println("\n--- Using Public Methods that access Private Data internally ---");
        myAccount.printStatement(); 
    }
}
