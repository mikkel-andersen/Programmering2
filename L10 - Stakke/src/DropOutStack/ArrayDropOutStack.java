package DropOutStack;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements DropOutStackI {

    private Object[] stack;
    private int top;
    private int count;

    public ArrayDropOutStack(int size) {

        top = -1;
        stack = new Object[size]; //Definerer max størrelsen på stacken
    }

    @Override
    public void push(Object element) {
        if (count < stack.length) {
            stack[top] = element;
            top++;
            count++;
        } else {
            stack[top] = element;
        }
    }



    @Override
    public Object pop() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    @Override
    public Object peek() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
