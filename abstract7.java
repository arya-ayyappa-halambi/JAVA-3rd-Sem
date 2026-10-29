abstract class Helper {


    // Abstract method
    static void demofun()
    {


        // Print statement
        System.out.println("Geeks for Geeks");
    }}


// Class 2
// Main class extending Helper class
public class abstract7 extends Helper {


    // Main driver method
    public static void main(String[] args)
    {
        // Calling method inside main()
        // as defined in above class
        Helper.demofun();
    }}
