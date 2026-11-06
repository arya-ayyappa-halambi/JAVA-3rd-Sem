import java.util.Scanner;

public class zerodivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();

        try {
            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}