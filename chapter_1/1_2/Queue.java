import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
public class Queue{
    public static int[] readInts(String name){
    In in = new In(name);
    Queue<Integer> q = new Queue<Integer>();
    while(!in.isEmpty())
        q.enqueue(in.readInt());
    int N  = q.size();
    int[] a = new int[N];
    for(int i =0; i<N;i++){
    a[i] = q.dequeue();
    return a;
    }
    
    }

}