import java.util.Scanner;

class Student {
    private String name;
    private String usn;

    // Parameterized Constructor (similar to C++)
    public Student(String name, String usn) {
        this.name = name; // 'this' keyword acts like the 'this->' pointer in C++
        this.usn = usn;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + " | USN: " + usn);
    }
}

public class studentconst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        Student[] studentArray = new Student[n];
        
        System.out.println("\n--- Enter Details for " + n + " Students ---");
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            System.out.print("Enter Student Name: ");
            String inputName = scanner.nextLine();
            
            System.out.print("Enter Student USN: ");
            String inputUsn = scanner.nextLine();
            
            // Pass values directly to the constructor during object instantiation
            studentArray[i] = new Student(inputName, inputUsn); 
        }
        
        System.out.println("\n--- Displaying All Student Details ---");
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].display();
        }
        
        scanner.close();
    }
}
