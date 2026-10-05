class OverloadDemo {

    // 1. Overloading by changing the NUMBER of arguments
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 2. Overloading by changing the DATA TYPE of parameters
    public void printValue(int value) {
        System.out.println("Printing Integer: " + value);
    }

    public void printValue(double value) {
        System.out.println("Printing Double: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        System.out.println("--- Changing Number of Arguments ---");
        System.out.println("Multiplying two numbers (5 * 4): " + demo.multiply(5, 4));
        System.out.println("Multiplying three numbers (5 * 4 * 2): " + demo.multiply(5, 4, 2));

        System.out.println("\n--- Changing Data Type of Parameters ---");
        demo.printValue(100);     // Calls the int version
        demo.printValue(99.99);   // Calls the double version
    }
}
