/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Percolation {
    private int size;
    private boolean[] status;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        size = n;
        status = new boolean[n * n + 1];
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

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return status[transformtoi(row, col)];

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return status[transformtoi(row, col)];

    }

    // returns the number of open sites
    public int numberOfOpenSites()

    // does the system percolate?
    public boolean percolates() {


    }

    // test client (optional)
    public static void main(String[] args) {

    }
}
