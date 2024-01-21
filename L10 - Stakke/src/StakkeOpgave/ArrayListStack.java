package StakkeOpgave;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {
    private ArrayList<Object> stack;
    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(Object element) {
        stack.add(element);
    }

    @Override
    public Object pop() {

        if (stack.size() == 0) {
            throw new NoSuchElementException();
        }
        Object top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }

    @Override
    public Object peek() {
        if (stack.size() == 0) {
            throw new NoSuchElementException();
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();

        // Test push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Test peek
        System.out.println("Top element: " + stack.peek()); // should print 3

        // Test size
        System.out.println("Size of stack: " + stack.size()); // should print 3

        // Test isEmpty
        System.out.println("Is stack empty? " + stack.isEmpty()); // should print false

        // Test pop
        System.out.println("Popped element: " + stack.pop()); // should print 3
        System.out.println("Size of stack after pop: " + stack.size()); // should print 2
    }
}
