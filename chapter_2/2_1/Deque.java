/* *****************************************************************************
 *  Name:kane
 *  Date:6/22
 *  Description:deque API, deque which is a generalization of a stack and a queue that supports adding and removing items from either the front or the back of the data structure
 **************************************************************************** */

import java.util.Iterator;


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

    }

    // add the item to the front
    public void addFirst(Item item) {
    }

    // add the item to the back
    public void addLast(Item item) {
    }

    // remove and return the item from the front
    public Item removeFirst() {
    }

    // remove and return the item from the back
    public Item removeLast() {
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
    }

    // unit testing (required)
    public static void main(String[] args) {


    }
}
