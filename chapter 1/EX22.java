public class EX22{
    public static int rank(int key, int[] a, int lo, int hi , int depth){
        for(int i =0;i<depth;i++){
        System.out.printf(" ");}
        System.out.println("lo="+lo +", hi=" +hi);
    if(lo > hi) return -1;
    int mid = lo + (hi -lo) /2;
    if(key < a[mid]) return rank(key,a, lo,mid-1,depth +1);
    else if(key > a[mid]) {return rank(key, a,mid +1,hi,depth +1);}
                   else return mid;
    }
public static void main(String[] args){
    int[] a = {1,2,3,4,6,7,8,9};
    int key =4;
    int pos = rank(key,a,0,a.length-1,0);
    if(pos == -1){
    System.out.println("not found!");}
else{System.out.println("position="+ pos);}
}
}
