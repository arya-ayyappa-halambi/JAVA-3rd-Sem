import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RealVMErrors {

    // 1. REAL StackOverflowError:
    // Infinite deep recursion overflows the JVM thread stack memory
    public static void triggerRealStackOverflow() {
        triggerRealStackOverflow();
    }

    // 2. REAL OutOfMemoryError:
    // Rapidly allocates massive contiguous memory blocks until the heap is genuinely exhausted
    public static void triggerRealOutOfMemory() {
        List<long[]> memoryDrain = new ArrayList<>();
        while (true) {
            // Continuously allocate 100 million longs (~800 MB each)
            memoryDrain.add(new long[100_000_000]);
        }
    }

    // 3. REAL VirtualMachineError:
    // In Java, VirtualMachineError is abstract and cannot occur alone; its real occurrences 
    // are its JVM subclasses (like OutOfMemoryError and StackOverflowError).
    // Here we catch the real JVM crash polymorphically as a VirtualMachineError.
    public static void triggerRealVirtualMachineError() {
        try {
            System.out.println("Causing real JVM heap exhaustion caught by VirtualMachineError base class...");
            List<byte[]> memoryDrain = new ArrayList<>();
            while (true) {
                memoryDrain.add(new byte[100 * 1024 * 1024]);
            }
        } catch (VirtualMachineError vme) {
            System.out.println("\nSuccessfully intercepted genuine JVM error!");
            System.out.println("Exact Class: " + vme.getClass().getName());
            System.out.println("Superclass : " + vme.getClass().getSuperclass().getName());
            System.out.println("Message    : " + vme.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a real JVM runtime error to trigger:");
        System.out.println("1. Genuine StackOverflowError (Crash JVM call stack)");
        System.out.println("2. Genuine OutOfMemoryError (Crash JVM heap)");
        System.out.println("3. Genuine VirtualMachineError (JVM heap crash caught as base VirtualMachineError)");
        System.out.print("Enter choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nTriggering real JVM call stack overflow...");
                triggerRealStackOverflow();
                break;
            case 2:
                System.out.println("\nTriggering real JVM heap exhaustion...");
                triggerRealOutOfMemory();
                break;
            case 3:
                triggerRealVirtualMachineError();
                break;
            default:
                System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}