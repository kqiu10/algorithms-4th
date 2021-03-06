import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class FastCollinearPoints {
    private final ArrayList<LineSegment> lineSegments = new ArrayList<>();

    public FastCollinearPoints(Point[] points) {
        // finds all line segments containing 4 or more points
        validate(points);
        int len = points.length;
        Point[] elements = points.clone();
        // Think of the first element as the origin. Sort the points according to the slopes they makes with it.
        for (int i = 0; i < len; i++) {
            Point[] ps = elements.clone();
            Arrays.sort(ps, ps[i].slopeOrder());
            Point ances = ps[0];
            double slopeSlow = ances.slopeTo(ps[1]);
            double slopeFast;
            //for each element to iterate through the array to check if there are 3 or more adjacent points have equal slopes.
            for (int idxSlow = 1, idxFast; idxSlow < len - 2;
                 idxSlow = idxFast, slopeSlow = slopeFast) {
                idxFast = idxSlow + 1;
                do {
                    slopeFast = ances.slopeTo(ps[idxFast++]);
                } while (slopeSlow == slopeFast && idxFast < len);
                idxFast--;
                // Check if any 3 or more adjacent points in the sorted order
                // have equal slopes with respect to ps[0].
                // If so, these points, together with ps[0], are collinear.
                int AdjacentPoint = idxFast - idxSlow;
                if (AdjacentPoint >= 3) {
                    Point[] segments = new Point[AdjacentPoint + 1];
                    segments[0] = ances;
                    System.arraycopy(ps, idxSlow, segments, 1, AdjacentPoint);
                    Arrays.sort(segments);
                    //make sure no duplicate subsegment
                    if (segments[0] == ances) {
                        lineSegments.add(new LineSegment(ances, segments[AdjacentPoint]));
                    }

                }
            }
        }

    }

    public int numberOfSegments() {
        // the number of line segments
        return lineSegments.size();
    }

    public LineSegment[] segments() {
        // the line segments
        return lineSegments.toArray(new LineSegment[numberOfSegments()]);
    }

    private static void validate(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException();
        }
        for (Point point : points) {
            if (point == null) {
                throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].equals(points[j])) {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    public static void main(String[] args) {

        // read the n points from a file
        In in = new In(args[0]);
        int n = in.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        // draw the points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();

        // print and draw the line segments
        FastCollinearPoints collinear = new FastCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }

}

