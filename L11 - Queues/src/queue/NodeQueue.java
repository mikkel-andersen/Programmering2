package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {
    private Node head;
    private Node tail;
    private int size;
    private Node node;

    class Node
    {
        public Object data;
        public Node next;

        public Node(Object data) {this.data = data;}

        public void setNext(Node next) {this.next = next;}

        public Node getNext() {return next;}
    }

    /**
     * Constructs an empty queue.
     */
    //Create empty nodequeue constructor
    public NodeQueue()
    {
        // TODO: Assignment 1: Implement this constructor...
        size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(Object element)
    {
        // TODO: Assignment 1: Implement this method...
        Node elementAddToQueue = new Node(element);
        if (head == null) {
            head = elementAddToQueue;
            tail = elementAddToQueue;
            size++;
        }
        else {
            tail.setNext(elementAddToQueue);
            tail = elementAddToQueue;
            size++;
        }
    }

    @Override
    public Object dequeue()
    {
        // TODO: Assignment 1: Implement this method...
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            Object element = head.data;
            head = head.next;
            size--;
            return element;
        }
    }

    @Override
    public int size()
    {
       return size;
    }

    @Override
    public boolean isEmpty()
    {
        return head == null;
    }
}
