class student {
    String name;
    String usn;
    float cgpa;

    // 1. Default constructor
    student() {
        this("H R Arya Ayyappa Halambi");
    }

    // 2. 1-parameter constructor
    student(String name) {
        this(name, "1BF25CS095");
    }

    // 3. 2-parameter constructor
    student(String name, String usn) {
        this(name, usn, 9.5f);
    }

    // 4. Base 3-parameter constructor (does the actual assignment)
    student(String name, String usn, float cgpa) {
        this.name = name;
        this.usn = usn;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("CGPA: " + cgpa);
    }
}

public class nestedconstructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}