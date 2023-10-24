package train;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListTrain {
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */

    public LinkedListTrain() {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     *
     * @return the first wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     *
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon) {
        // TODO: Assignment 1: Implement this add method...
        if (firstWagon == null) {
            firstWagon = wagon;
        } else if (firstWagon != null) {
            WagonNode temp = firstWagon;
            firstWagon = wagon;
            firstWagon.setNextWagon(temp);
        } else {
            throw new UnsupportedOperationException("Not implemented");
        }


    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @return the removed wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst() {
        // TODO: Assignment 2: Implement this remove method...

        if (firstWagon != null) {
            WagonNode temp = firstWagon;
            firstWagon = firstWagon.getNextWagon();
            return temp;
        } else {
            throw new NoSuchElementException();
        }

    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     *
     * @return the number of wagon nodes
     */
    public int count() {
        int count = 0;
        WagonNode temp = firstWagon;
        while (temp != null) {
            count++;
            temp = temp.getNextWagon();
        }
        return count;
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     * <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon) {
        // TODO: Assignment 4: Implement this remove method...

        if (firstWagon == null) {
            return false;
        } else if (firstWagon.equals(wagon)) {
            removeFirst();
            return true;
        } else {
            WagonNode temp = firstWagon;
            while (temp.getNextWagon() != null) {
                if (temp.getNextWagon().equals(wagon)) {
                    temp.setNextWagon(temp.getNextWagon().getNextWagon());
                    return true;
                }
                temp = temp.getNextWagon();
            }
            return false;
        }
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     *
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position) {
        // TODO: Assignment 5: Implement this insert method...
        boolean found = false;
        WagonNode current = firstWagon;
        WagonNode previous = null;
        int count = 0;

        if (position == 0) {
            addFirst(wagon);
        } else {

            while (count != position) {
                System.out.println(current.getWagonName());
                previous = current;
                current = current.getNextWagon();
                count++;
                if (position == count) {
                    previous.setNextWagon(wagon);
                    wagon.setNextWagon(current);

                }
            }
        }
    }
}
