class example {
    int a; 

    example(int a) {
        this.a = a; // 
    }

    void display() {
        System.out.println("Value of a: " + a);
    }
}

public class Thisexample {
    public static void main(String[] arg) {
        int a = 10;
        example obj = new example(a);
        obj.display();
    }
}