/* *****************************************************************************
 *  Name:              Kan Qiu
 *  Coursera User ID:  123456
 *  Last modified:     6/20/2020
 **************************************************************************** */


import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private double mean;
    private double stddev;
    private double confidenceLo;
    private double confidenceHi;
    private static final double CONFIDENCE_95 = 1.96;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {
        double[] fractions = new double[trials];
        for (int numOfTrail = 0; numOfTrail < trials; numOfTrail++) {
            Percolation p = new Percolation(n);
            //check if p is percolated, if not ,connect row and col
            while (!p.percolates()) {
                int row = StdRandom.uniform(1, n + 1);
                int col = StdRandom.uniform(1, n + 1);
                p.open(row, col);
            }
            //after percolate p,calculate fractions for each try
            fractions[numOfTrail] = (double) p.numberOfOpenSites() / (n * n) + 1;

        }
        //SrdStats.mean require [] as arguments;
        mean = StdStats.mean(fractions);
        stddev = StdStats.stddev(fractions);
        confidenceLo = mean - (CONFIDENCE_95 * stddev) / Math.sqrt(trials);
        confidenceHi = mean - (CONFIDENCE_95 * stddev) / Math.sqrt(trials);

    }

    // sample mean of percolation threshold
    public double mean() {
        return mean;
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return stddev;
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {

        return confidenceLo;
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {

        return confidenceHi;
    }

    // test client (see below)
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        PercolationStats ps = new PercolationStats(n, trials);
        StdOut.println("mean= " + ps.mean());
        StdOut.println("std = " + ps.stddev());
        StdOut.println("confidenceLo" + ps.confidenceLo());
        StdOut.println("confidenceHi" + ps.confidenceHi());
    }
}
