abstract class Base {


    final void fun()
    {
        System.out.println("Base fun() called");
    }}


// Class 2
class Derived extends Base {
  }


// Class 3
// Main class
class abstract6 {


    // Main driver method
    public static void main(String args[])
    {
        {
            // Creating object of abstract class


            Base b = new Derived();
            // Calling method on object created above
            // inside main method


            b.fun();
        }    }}


