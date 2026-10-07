class Employee {
    String name;

    Employee(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // finalize() is called right before an object is garbage-collected (used here to demonstrate GC execution)
    @Override
    protected void finalize() {
        System.out.println(name + " destroyed by Garbage Collector.");
    }
}

public class garbagecollectiondemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arya");
        Employee e2 = new Employee("Halambi");

        // 1. Make objects unreachable
        e1 = null; // e1 is eligible
        e2 = null; // e2 is eligible

        // 2. Request garbage collection
        System.out.println("Requesting GC...");
        System.gc();

        // Pause briefly to give GC thread time to run before main exits
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method completed.");
    }
}