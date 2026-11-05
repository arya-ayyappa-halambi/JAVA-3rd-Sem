import p2.ClassB;

class ClassC extends ClassB {
    int n = 20;

    void displayC() {
        System.out.println("Class C");
        System.out.println("m= " + m);
        System.out.println("n= " + n);
    }
}

public class PackageTest3 {
    public static void main(String[] args) {
        ClassC obC = new ClassC();
        obC.displayB();
        obC.displayC();
    }
}
