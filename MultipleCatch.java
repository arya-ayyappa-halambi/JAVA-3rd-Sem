class MultipleCatch {
public static void main(String[] args) {
try {
int a = args.length;
System.out.println("a = " + a);
int b = 42 / a; // fails if a == 0
int[] c = { 1 };
c[42] = 99; // fails otherwise
} catch (ArithmeticException e) {
System.out.println("Divide by 0: " + e);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array index oob: " + e);
}
System.out.println("After try/catch blocks.");
} finally {
    System.out.println("This is the finally block, it always executes.");
}
}
}