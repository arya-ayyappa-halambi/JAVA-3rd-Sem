
import transaction.Account;
import reports.TransactionReport;

public class MainApp {
    public static void main(String[] args) {
       
        Account myAccount = new Account("SB-10928374", 5000.00);

        
        System.out.println("Performing transactions...");
        myAccount.deposit(2500.00);
        myAccount.withdraw(1200.00);
        System.out.println();

        
        TransactionReport report = new TransactionReport();
        report.generateReport(myAccount);
    }
} {
    
}
