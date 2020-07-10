package collinear;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteCollinearPoints {
    private final ArrayList<LineSegment> lineSegments = new ArrayList<>();

    public BruteCollinearPoints(Point[] points) {
        // finds all line segments containing 4 points
        for (int i = 0; i < points.length - 3; i++) {
            for (int j = i + 1; j < points.length - 2; j++) {
                for (int k = i + 2; k < points.length; k++) {
                    for (int h = i + 3; h < points.length; h++) {
                        if (points[i].slopeTo(points[j]) == points[i].slopeTo(points[k])
                                && points[i].slopeTo(points[k]) == points[i].slopeTo(points[h])) {
                            Point[] elements = {
                                    points[i], points[j], points[k], points[j]
                            };
                            Arrays.sort(elements);
                            lineSegments.add(new LineSegment(elements[0], elements[3]));
                        }
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
        //read segements and store in an array
        In in = new In(args[0]);
        int n = in.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }
        //draw points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();
        // print and draw the line segments
        BruteCollinearPoints collinear = new BruteCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();


    }
}
