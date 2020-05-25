import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class EX15{
    public static void main(String[] args){
        int k = Integer.parseInt(args[0]);
        Queue<String> queue = new Queue<>();
        while(!StdIn.isEmpty()){
        String value = StdIn.readString();
        queue.enqueue(value);
        
        }
        int idx = queue.size() -k;
        //dequeue the queue till there
        for(int i =0;i<idx;i++){
        String result = queue.dequeue();
        if(i == idx-1)
         StdOut.println("the item is " + result);
        }
    }

}