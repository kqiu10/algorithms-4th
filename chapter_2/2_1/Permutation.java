/* *****************************************************************************
 *  Name:kane
 *  Date:6/26
 *  Description: takes an integer k as a command-line argument; reads a sequence of strings from standard input using StdIn.readString(); and prints exactly k of them, uniformly at random. Print each item from the sequence at most once.
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        final int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> res = new RandomizedQueue<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (k == 0) {
                return;
            }
            else {
                res.enqueue(s);
            }

        }
        while (!res.isEmpty()) {
            StdOut.println(res.dequeue());
        }


    }
}
