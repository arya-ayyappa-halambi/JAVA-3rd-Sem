class AddDemo {
    int a;

    // Constructor
    AddDemo(int a) {
        this.a = a;
    }

    // Method taking another AddDemo object and returning a new one
    AddDemo add(AddDemo other) {
        return new AddDemo(this.a + other.a);
    }

    void display() {
        System.out.println("Value of a: " + a);
    }
}

public class object_add {
    public static void main(String[] args) {
        AddDemo obj1 = new AddDemo(10);
        AddDemo obj2 = new AddDemo(20);

        AddDemo result = obj1.add(obj2);
        result.display();
    }
}