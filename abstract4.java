abstract class Base {


    // Constructor of class 1
    Base()
    {
        // Print statement
        System.out.println("Base Constructor Called");
    }


    // Abstract method inside class1
    abstract void fun();
}


// Class 2
class Derived extends Base {


    // Constructor of class2
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }
void fun()
    {
        System.out.println("Derived fun() called");
    }}


// Class 3
// Main class
class abstract4 {


    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 2
        // inside main() method
        Derived d = new Derived();
        d.fun();
    }}
