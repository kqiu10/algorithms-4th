public class EX29{
    public static int rank(int k, int[] a){
        int countLess = 0;
        int countEqual = 0;
        for(int i =0;i< a.length -1;i++){
            if(a[i] < k){
            
            countLess ++;}
            else if(a[i] == k){
        countEqual ++;
        }
        }
        return countLess;
    }
    public static int count(int k, int[] a){
        int countLess = 0;
        int countEqual = 0;
        for(int i =0;i< a.length -1;i++){
            if(a[i] < k){
            
            countLess ++;}
            else if(a[i] == k){
        countEqual ++;
        }
        }
        return countEqual;
    }
   
    public static void main(String[] args){
        int[] a = {1,3,4,5,6,6,7,8};
    System.out.println(rank(6,a));
    System.out.println(count(6,a));
    }
}