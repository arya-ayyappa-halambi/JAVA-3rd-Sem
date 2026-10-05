// Save this entire code into your Main.java file

// Class 1: Represents a Student object
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

// Class 2: Represents a Teacher object
class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}

// Class 3: Contains the overloaded methods
class Printer {
    
    // Overloaded method that accepts a Student object
    void printDetails(Student s) {
        System.out.println("Processing Student Object... Name: " + s.name);
    }

    // Overloaded method that accepts a Teacher object
    void printDetails(Teacher t) {
        System.out.println("Processing Teacher Object... Name: " + t.name);
    }
}

// Main execution class
public class objectpara {
    public static void main(String[] args) {
        // 1. Create instances of our classes/objects
        Student studentObj = new Student("Arya");
        Teacher teacherObj = new Teacher("Dr. Smith");
        Printer printer = new Printer();

        System.out.println("--- Method Overloading with Objects ---");

        // 2. Call the overloaded method passing the Student object
        printer.printDetails(studentObj);

        // 3. Call the overloaded method passing the Teacher object
        printer.printDetails(teacherObj);
    }
}
