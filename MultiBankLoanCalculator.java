import java.util.Scanner;

// Parent Class
class Bank {
    double getInterestRate() {
        return 5.0; // Default base rate
    }

    // Overloaded calculation methods available to all banks
    double calculateInterest(double principal, int years) {
        return (principal * getInterestRate() * years) / 100;
    }

    double calculateInterest(double principal, int years, double processingFee) {
        double baseInterest = (principal * getInterestRate() * years) / 100;
        return baseInterest + processingFee;
    }
}

// Child Class 1: SBI
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 7.5; // SBI specific rate
    }
}

// Child Class 2: HDFC
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 8.5; // HDFC specific rate
    }
}

// Child Class 3: ICICI
class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 8.0; // ICICI specific rate
    }
}

public class MultiBankLoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter loan principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter loan tenure (in years): ");
        int years = sc.nextInt();

        System.out.print("Enter flat processing fee: ");
        double fee = sc.nextDouble();

        // Creating objects for all 3 banks
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        // Displaying results using polymorphism
        System.out.println("\n=== Bank Comparison Results ===");
        
        displayLoanDetails("SBI", sbi, principal, years, fee);
        displayLoanDetails("HDFC", hdfc, principal, years, fee);
        displayLoanDetails("ICICI", icici, principal, years, fee);

        sc.close();
    }

    // Helper method to display details cleanly
    public static void displayLoanDetails(String bankName, Bank bank, double principal, int years, double fee) {
        System.out.println("\n-- " + bankName + " --");
        System.out.println("Interest Rate (Overridden): " + bank.getInterestRate() + "%");
        
        // Calling overloaded method 1 (Standard Interest)
        System.out.println("Standard Interest: " + bank.calculateInterest(principal, years));
        
        // Calling overloaded method 2 (Interest + Processing Fee)
        System.out.println("Total with Processing Fee: " + bank.calculateInterest(principal, years, fee));
    }
}
