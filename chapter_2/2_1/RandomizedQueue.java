/* *****************************************************************************
 *  Name:kane
 *  Date:6/26
 *  Description:A randomized queue is similar to a stack or queue, except that the item removed is chosen uniformly at random among items in the data structure.
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] items;
    private int size;

    // construct an empty randomized queue
    public RandomizedQueue() {
        this.size = 0;
        this.items = (Item[]) new Object[1];
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
        return size;
    }

    // add the item
    public void enqueue(Item item) {
        validate(item);
        if (size == items.length) {
            Resize(size * 2);
        }
        items[size] = item;
        size++;

    }

    // remove and return a random item
    public Item dequeue() {
        validate();
        int res = StdRandom.uniform(size);
        Item pos = (Item) items[res];
        // remove item in specific index and use the last element to fill the index, then delete the last index.
        items[res] = items[size - 1];
        items[size - 1] = null;
        if (size > 0 && size <= items.length / 4) {
            Resize(items.length / 2);
        }
        return pos;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        validate();
        int res = StdRandom.uniform(size);
        Item pos = items[res];
        return pos;
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }

    private void Resize(int size) {
        Item[] newQueue = (Item[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newQueue[i] = items[i];
        }
        items = newQueue;

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
    }

}
