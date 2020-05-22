import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX6{
    public static void main(String[] args){
    System.out.print("s: ");
    String s = StdIn.readLine();
    System.out.print("t: ");
    String t = StdIn.readLine();
    
    if(s.length() == t.length() && s.concat(s).indexOf(t) >= 0){
    StdOut.println(s + " is the circular rotation of " + t);
    }else{
    StdOut.println(s + " is not the circular rotation of " + t);
    }
    }


}
