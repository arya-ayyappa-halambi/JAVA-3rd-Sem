import java.io.*;


// here if we remove the abstract 
// keyword then we will get compile
// time error due to abstract method
abstract class Demo {
    abstract void m1();
}


class Child extends Demo {
    public void m1() 
    { 
      System.out.print("Hello"); 
    }
}
class abstract10 {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.m1();
    }}
