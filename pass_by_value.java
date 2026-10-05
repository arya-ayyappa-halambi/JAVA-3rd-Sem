// Save this entire code into your Main.java file

class NumberWrapper {
    int value;
    
    NumberWrapper(int value) {
        this.value = value;
    }
}

public class pass_by_value {

    // 1. Demonstrating Pass-by-Value with Primitives
    public static void modifyPrimitive(int num) {
        num = 999; // Changes only the local copy inside this method
    }

    // 2. Demonstrating Pass-by-Value with Object References
    public static void modifyObjectField(NumberWrapper obj) {
        obj.value = 999; // Modifies the object data at the shared memory address
    }

    // 3. Demonstrating that Object references themselves are passed by value
    public static void reassignObject(NumberWrapper obj) {
        // Pointing the local reference to a completely new object
        obj = new NumberWrapper(5000); 
    }

    public static void main(String[] args) {
        System.out.println("--- 1. PRIMITIVE TYPES ---");
        int originalPrimitive = 10;
        System.out.println("Before modifyPrimitive: " + originalPrimitive);
        modifyPrimitive(originalPrimitive);
        System.out.println("After modifyPrimitive: " + originalPrimitive); // Stays 10

        System.out.println("\n--- 2. OBJECTS (Modifying Internal Data) ---");
        NumberWrapper originalObject = new NumberWrapper(10);
        System.out.println("Before modifyObjectField: " + originalObject.value);
        modifyObjectField(originalObject);
        System.out.println("After modifyObjectField: " + originalObject.value); // Changes to 999

        System.out.println("\n--- 3. OBJECTS (Attempting Reassignment) ---");
        NumberWrapper secondaryObject = new NumberWrapper(20);
        System.out.println("Before reassignObject: " + secondaryObject.value);
        reassignObject(secondaryObject);
        System.out.println("After reassignObject: " + secondaryObject.value); // Stays 20
    }
}
