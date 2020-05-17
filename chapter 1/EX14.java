import edu.princeton.cs.algs4.StdIn;
public class EX14{
    public static int lg(int n){
        int base = 2;
        int pow = 1;
        int sum = 2;
        for(pow =1; sum < n;pow++){
        sum *= base;
        }
        return pow -1;
        
    }
    public static void main(String[] args){
    int x = StdIn.readInt();
     System.out.printf("the result of method log is :%s\r\n", lg(x));
    }
}