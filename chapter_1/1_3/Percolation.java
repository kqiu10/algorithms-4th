/* *****************************************************************************
 *  Name:              Kan Qiu
 *  Coursera User ID:  123456
 *  Last modified:6/20/2020
 **************************************************************************** */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private int size, count;
    private boolean[] status;
    private WeightedQuickUnionUF first, last;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        size = n;
        status = new boolean[n * n + 1];
        status[0] = true; //root element is true;
        //create union-find data structure with size n*n+1
        first = new WeightedQuickUnionUF(n * n + 1);
        last = new WeightedQuickUnionUF(n * n + 2);
        //left corner element should be 1,1
        for (int i = 1; i < n * n + 1; i++) {
            status[i] = false;

        }

    }

    //change column and row into single i
    private int transformtoi(int row, int col) {
        if (row < 1 || row > size || col < 1 || col > size) {
            throw new java.lang.IndexOutOfBoundsException("" + "col or row out of bound!");

        }
        return (row - 1) * size + col;

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (row < 1 || row > size || col < 1 || col > size) {
            throw new java.lang.IndexOutOfBoundsException("" + "col or row out of bound!");

        }
        if (!status[transformtoi(row, col)]) {
            status[transformtoi(row, col)] = true;
        }
        //connect virtual root element and first row
        if (row == 1) {
            first.union(0, transformtoi(row, col));
            last.union(0, transformtoi(row, col));

        }
        //connect virtual bottom element
        if (row == size) {
            last.union(transformtoi(row, col), size * size + 1);
        }
        //connect true element in four directions
        if (row < size && status[transformtoi(row + 1, col)]) {
            first.union(transformtoi(row, col), transformtoi(row - 1, col));
            last.union(transformtoi(row, col), transformtoi(row - 1, col));
        }
        if (row > 1 && status[transformtoi(row - 1, col)]) {
            first.union(transformtoi(row, col), transformtoi(row + 1, col));
            last.union(transformtoi(row, col), transformtoi(row + 1, col));

        }
        if (col < size && status[transformtoi(row, col + 1)]) {
            first.union(transformtoi(row, col), transformtoi(row, col - 1));
            last.union(transformtoi(row, col), transformtoi(row, col - 1));
        }
        if (col > 1 && status[transformtoi(row, col - 1)]) {
            first.union(transformtoi(row, col), transformtoi(row, col + 1));
            last.union(transformtoi(row, col), transformtoi(row, col + 1));

        }

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return status[transformtoi(row, col)];

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return first.connected(0, transformtoi(row, col));

    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        count = 0;
        for (int i = 1; i < size * size + 1; i++) {
            if (status[i]) {
                count++;
            }

        }
        return count;

    }

    // does the system percolate?
    public boolean percolates() {
        return last.connected(0, size * size + 1);


    }

    // test client (optional)
    public static void main(String[] args) {

    }
}
