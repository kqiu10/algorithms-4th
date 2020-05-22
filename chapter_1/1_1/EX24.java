public class EX24{
    public static int gcd(int p, int q){
        System.out.printf("%3d",p);
        
        System.out.printf("%3d",q);
        System.out.println();
    if(q == 0)return p;
    int r = p % q;
    return gcd(q,r);
    }
    public static void main(String[] args){
    System.out.print(gcd(1111111,1234567));
    }
    

}