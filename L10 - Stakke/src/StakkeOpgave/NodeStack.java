package StakkeOpgave;

import java.util.NoSuchElementException;

public class NodeStack implements StackI {

    private Object top;

    class Node {
        public Object data;
        public Node next;
    }

    public NodeStack() {
        top = null;
    }

    @Override
    public void push(Object element) {
        Node node = new Node();
        node.data = element;
        node.next = (Node) top;
        top = node;
    }

    @Override
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Node node = (Node) top;
        top = node.next;
        return node.data;
    }

    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return ((Node) top).data;
    }

    @Override
    public int size() {
        int count = 0;
        Node node = (Node) top;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
