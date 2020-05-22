import edu.princeton.cs.algs4.StdIn;
public class EX20{
    public static double LOG(int N){
        if(N == 0) return 0;
        else{
        return(Math.log(N) + LOG(N-1));
        }
    }
    public static void main(String[] args){
    int a = StdIn.readInt();
    System.out.println(LOG(a));
    }

}