import edu.princeton.cs.algs4.StdIn;
public class EX21{
    public static void main (String[] args){
        System.out.print("please input count");
        int n = StdIn.readInt();
        String[] Array = new String[n];
        int[] IntegerArray1 = new int[n];
        int[] IntegerArray2 = new int[n];
        for(int i=0;i<n;i++){
            Array[i] = StdIn.readString();
            IntegerArray1[i] = StdIn.readInt();
            IntegerArray2[i] = StdIn.readInt();
        }
        for(int i =0; i<n;i++){
        System.out.printf("|%4s|%4d|%4d|%6.3f|\n", Array[i], IntegerArray1[i],IntegerArray2[i],
              (float)IntegerArray1[i]/IntegerArray2[i]);            
        }
    }
}