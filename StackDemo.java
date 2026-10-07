import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());               // 30
        System.out.println("Stack size: " + stack.size());          // 2
    }
}