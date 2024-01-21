package deque;

public class Deque implements DequeI {

    private Object[] deque;
    private int head;
    private int tail;
    private int size;

    public Deque(int size) {
        deque = new Object[size];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public void addFirst(Object element) {
        growIfNecessary();
        head = (head - 1 + deque.length) % deque.length;
        deque[head] = element;
        size++;
    }

    @Override
    public void addLast(Object element) {
        growIfNecessary();
        deque[tail] = element;
        tail = (tail + 1) % deque.length;
        size++;
    }

    @Override
    public Object removeFirst() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        Object element = deque[head];
        deque[head] = null;
        head = (head + 1) % deque.length;
        size--;
        return element;
    }

    @Override
    public Object removeLast() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        tail = (tail - 1 + deque.length) % deque.length;
        Object element = deque[tail];
        deque[tail] = null;
        size--;
        return element;
    }

    @Override
    public Object getFirst() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return deque[head];
    }

    @Override
    public Object getLast() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return deque[(tail - 1 + deque.length) % deque.length];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void growIfNecessary() {
        if (size == deque.length) {
            Object[] newDeque = new Object[deque.length * 2];
            for (int i = 0; i < deque.length; i++) {
                newDeque[i] = deque[(head + i) % deque.length];
            }
            deque = newDeque;
            head = 0;
            tail = size;
        }
    }

    public static void main(String[] args) {

        Deque deque = new Deque(5);

        // Test addFirst
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        // Test addLast
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        // Test removeFirst
        System.out.println("Removed element: " + deque.removeFirst()); // should print 3
        System.out.println("Size of deque after removeFirst: " + deque.size()); // should print 5

        // Test removeLast
        System.out.println("Removed element: " + deque.removeLast()); // should print 6
        System.out.println("Size of deque after removeLast: " + deque.size()); // should print 4

        // Test getFirst
        System.out.println("First element: " + deque.getFirst()); // should print 2

        // Test getLast
        System.out.println("Last element: " + deque.getLast()); // should print 5

        // Test size
        System.out.println("Size of deque: " + deque.size()); // should print 4

        // Test isEmpty
        System.out.println("Is deque empty? " + deque.isEmpty()); // should print false

    }



}
