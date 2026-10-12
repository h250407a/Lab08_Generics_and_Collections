// Implements a generic LIFO Stack data structure backed by an ArrayList.
import java.util.ArrayList;

class GenericStack<T> {
    private final ArrayList<T> storage = new ArrayList<>();

    public void push(T item) {
        storage.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty; cannot pop.");
        }
        return storage.remove(storage.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty; cannot peek.");
        }
        return storage.get(storage.size() - 1);
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    public int size() {
        return storage.size();
    }
}

public class CustomGenericStackDemo {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Alpha");
        stack.push("Beta");
        stack.push("Gamma");

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element    : " + stack.pop());
        System.out.println("Popped element    : " + stack.pop());
        System.out.println("Is stack empty?   : " + stack.isEmpty());
        System.out.println("Popped element    : " + stack.pop());
        System.out.println("Is stack empty?   : " + stack.isEmpty());
    }
}
