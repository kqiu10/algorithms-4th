/* *****************************************************************************
 *  Name:kane
 *  Date:6/22
 *  Description:deque API, deque which is a generalization of a stack and a queue that supports adding and removing items from either the front or the back of the data structure
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int size;

    //create Node class to implement tow-direction list

    private class Node {
        private Item item;
        private Node prev;
        private Node next;

        Node(Item item) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }

        Node(Item item, Node prev, Node next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        //remove one node
        void remove() {
            this.prev.next = this.next;
            this.prev.prev = this.prev;
            this.nullify();
        }

        //extract space of this element
        void nullify() {
            this.item = null;
            this.prev = null;
            this.next = null;

        }

    }

    // construct an empty deque
    public Deque() {
        first = null;
        last = null;
        size = 0;

    }

    // is the deque empty?
    public boolean isEmpty() {
        return size == 0;

    }

    // return the number of items on the deque
    public int size() {
        return size;

    }

    // add the item to the front
    public void addFirst(Item item) {
        validate(item);
        if (isEmpty()) {
            Node newNode = new Node(item, null, null);
            first = newNode;
            last = newNode;

        }
        else {
            Node newNode = new Node(item, null, first);
            first.prev = newNode;
            first = newNode;

        }
        size++;

    }

    // add the item to the back
    public void addLast(Item item) {
        validate(item);
        if (isEmpty()) {
            Node newNode = new Node(item, null, null);
            first = newNode;
            last = newNode;
        }
        else {
            Node newNode = new Node(item, last, null);
            last.next = newNode;
            last = newNode;

        }
        size++;

    }

    // remove and return the item from the front
    public Item removeFirst() {
        validate();
        if (size == 1) {
            Item item = first.item;
            first.remove();
            size--;
            return item;

        }
        else {
            Item item = first.item;
            first.item = null;
            first = first.next;
            first.prev = null;
            size--;
            return item;


        }

    }

    // remove and return the item from the back
    public Item removeLast() {
        validate();
        if (size == 1) {
            Item item = last.item;
            last.remove();
            size--;
            return item;

        }
        else {
            Item item = last.item;
            last.item = null;
            last = last.prev;
            last.next = null;
            size--;
            return item;


        }
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current = first;


        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;

        }

    }

    private void validate() {
        if (isEmpty())
            throw new NoSuchElementException();
    }

    private void validate(Item item) {
        if (item == null) throw new IllegalArgumentException();

    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        for (int i = 0; i < 20; i += 2) {
            deque.addFirst(i);

        }
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()) {
            StdOut.print(it.next() + " ");

        }
        StdOut.println("size " + deque.size);
        for (int i = 0; i < 3; i++) {
            deque.removeFirst();
            deque.removeLast();

        }
        it = deque.iterator();
        while (it.hasNext()) {
            StdOut.print(it.next() + " ");

        }
        StdOut.println("size " + deque.size);
        for (int i = 5; i > 0; i--) {
            deque.addLast(i);

        }
        it = deque.iterator();
        while (it.hasNext()) {
            StdOut.print(it.next() + " ");

        }
        StdOut.println("size " + deque.size);

    }
}
