package my_package;

public class B {
    public void f() {
        int d = 42;
        A a = new A(d);
        int val = a.get();
        System.out.println("Accessing package-private get() from class B: " + val);
    }
}
