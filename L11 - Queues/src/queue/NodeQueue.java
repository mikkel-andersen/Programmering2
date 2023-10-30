package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {
    private int head;
    private int tail;
    private int currentSize;
    private Node node;

    class Node
    {
        public Object data;
        public Node next;
    }

    /**
     * Constructs an empty queue.
     */
    //Create empty nodequeue constructor
    public NodeQueue()
    {
        // TODO: Assignment 1: Implement this constructor...
        head = 0;
        tail = 0;
        currentSize = 0;
        node = new Node();
        node.data = null;
        node.next = null;
    }

    @Override
    public void enqueue(Object element)
    {
        // TODO: Assignment 1: Implement this method...
        if (node.data == null)
        {
            node.data = element;
            currentSize++;
        }
        else
        {
            Node newNode = new Node();
            newNode.data = element;
            node.next = newNode;
            currentSize++;
        }
    }

    @Override
    public Object dequeue()
    {
        // TODO: Assignment 1: Implement this method...
        if (node.data == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            Object removed = node.data;
            node = node.next;
            currentSize--;
            return removed;
        }
    }

    @Override
    public int size()
    {
       return currentSize;
    }

    @Override
    public boolean isEmpty()
    {
        return node.data == null;
    }
}
