import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Date;
public class readDates{
    public static void main(String[] args){
        Queue<String> queue = new Queue<>();
        
        String[] a = StdIn.readString().split("/");
        for(int i =0;i<a.length;i++){
          int mon = Integer.parseInt(a[0]);
          int day = Integer.parseInt(a[1]);
          int year = Integer.parseInt(a[2]);
          Date date = new Date(mon,day,year);
         queue.enqueue(date.toString());
        }
        
        String result = queue.dequeue();
        StdOut.println(result);
        
        
            
       
    
    
    
    }



}