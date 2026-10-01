import java.util.Scanner;

class Student {
    private String name;
    private String usn;

    // Method to accept student details
    public void accept(Scanner scanner) {
        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter Student USN: ");
        usn = scanner.nextLine();
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + " | USN: " + usn);
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        
        // 1. Declare and instantiate the array of Student objects
        Student[] studentArray = new Student[n];
        
        // 2. Loop to instantiate each object and accept details
        System.out.println("\n--- Enter Details for " + n + " Students ---");
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            studentArray[i] = new Student(); // Allocate memory for the individual object
            studentArray[i].accept(scanner);  // Call the accept method
        }
        
        // 3. Loop to display all student details
        System.out.println("\n--- Displaying All Student Details ---");
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].display();
        }
        
        scanner.close();
    }
}
