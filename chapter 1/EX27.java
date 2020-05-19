public class EX27{
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    public static double[][] MATRIX;
    public static double binomial(int N,int k,double p){
     COUNT++;
    if(N == 0 && k == 0) return 1.0;
    if(N<0 || k<0) return 0.0;
    return (1.0-p) *binomial(N-1,k,p) + p* binomial(N-1,k,p);
    }
   
    public static double bino(int N, int k,double p){
    COUNT2++;
    if(N == 0 && k == 0) return 1.0;
    if(N<0 || k<0) return 0.0;
    if (MATRIX[N][k] == -1) {
   MATRIX[N][k] = (1.0 - p) * bino(N - 1, k, p) + p * bino(N - 1, k - 1, p);
  }
  return MATRIX[N][k];
    }
    public static double betterBinomal(int N, int k, double p){
    MATRIX = new double[N+1][k+1];
    for(int i =0;i<=N;i++){
        for(int j =0;j<=k;j++){
        MATRIX[i][j] = -1;
        }
    }
    return bino(N,k,p);
    }
     public static void main(String[] args){
    System.out.println("result: " + binomial(10, 5, 0.25) + ", count: " + COUNT);
     System.out.println("result: " + betterBinomal(10, 5, 0.25) + ", count: " + COUNT2);
    }

}