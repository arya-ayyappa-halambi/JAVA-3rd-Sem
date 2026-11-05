import p1.*;
import p2.*;

public class ConflictDemo {
    public static void main(String[] args) {
        p1.Student student1 = new p1.Student();
        p2.Student student2 = new p2.Student();
        student1.info();
        student2.info();
    }
}
