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
}
