class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class inheritance{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}