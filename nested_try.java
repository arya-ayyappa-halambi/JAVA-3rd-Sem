public class nested_try {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0; // This will cause an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught an arithmetic exception: " + e.getMessage());
            } finally {
                System.out.println("Inner finally block executes.");
            }
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Outer finally block executes.");
        }
    }

}
