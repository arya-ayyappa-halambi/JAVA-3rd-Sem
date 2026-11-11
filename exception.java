public class exception extends Exception {
    public exception(String message) {
        super(message);
    }
    
    
}
public class test{

    public static void main(String[] args) {
        try {
            throw new exception("This is a custom exception");
        } catch (exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}