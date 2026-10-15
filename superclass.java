// Parent Class (Superclass)
class Animal {
    String name;

    // Parent Constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Parent constructor called: Animal is " + name);
    }
}

// Child Class (Subclass)
class Dog extends Animal {
    String breed;

    // Child Constructor
    Dog(String name, String breed) {
        // super() must be the very first statement
        super(name); 
        this.breed = breed;
        System.out.println("Child constructor called: Breed is " + breed);
    }

    void display() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

// Main class to run the program
public class superclass {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.display();
    }
}