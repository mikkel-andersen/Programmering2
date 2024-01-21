package LinkedList;

public class SkabelonLinkedList {
    private Node head;

    public SkabelonLinkedList() {
        head = null;
    }

    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public int getElement(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1; // element not found
    }

    public int size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void removeElement(int index) {
        if (head == null || index < 0 || index >= size()) {
            return; // invalid index or empty list
        }
        if (index == 0) {
            head = head.next; // remove head
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next; // remove element
    }

    public static void main(String[] args) {
        SkabelonLinkedList linkedList = new SkabelonLinkedList();

        // Test addElement
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);

        // Test getElement
        System.out.println("Element at index 0: " + linkedList.getElement(0)); // should print 1
        System.out.println("Element at index 1: " + linkedList.getElement(1)); // should print 2
        System.out.println("Element at index 2: " + linkedList.getElement(2)); // should print 3

        // Test size
        System.out.println("Size of linked list: " + linkedList.size()); // should print 3

        // Test isEmpty
        System.out.println("Is linked list empty? " + linkedList.isEmpty()); // should print false

        // Test removeElement
        linkedList.removeElement(1);
        System.out.println("Size of linked list after removal: " + linkedList.size()); // should print 2
        System.out.println("Element at index 1 after removal: " + linkedList.getElement(1)); // should print 3
    }
}