
import edu.princeton.cs.algs4.StdIn;
public class EX16{
   private int numerator;
   private int denominator;
   private static int MAX = 2147483647;
   private static int MIN = -2147483647;
   
   public EX16(int numerator, int denominator) throws ArithmeticException{
   if (denominator == 0) {
   throw new ArithmeticException("Divide by zero");
  }
  if (denominator < 0) {
   numerator = -numerator;
   denominator = -denominator;
  }
  int commonDivisor = euclid(numerator, denominator);
  this.numerator = numerator / commonDivisor;
  this.denominator = denominator / commonDivisor;
   }
   private int euclid(int p,int q){
   if (p == 0 || q == 0) {
   return 1;
  }
  p = Math.abs(p);
  q = Math.abs(q);
  if (p < q) {
   int t = p;
   p = q;
   q = t;
  }
  if (p % q == 0) {
   return q;
  } else {
   return euclid(q, p % q);
  }
 }
   public static void main(String[] args){
   System.out.println("Rational a:");
  System.out.print("numerator: ");
  int numerator = StdIn.readInt();
  System.out.print("denominator: ");
  int denominator = StdIn.readInt();
  EX16 a = new EX16(numerator, denominator);
  System.out.println("Rational b:");
  System.out.print("numerator: ");
  numerator = StdIn.readInt();
  System.out.print("denominator: ");
  denominator = StdIn.readInt();
  EX16 b = new EX16(numerator, denominator);
   }
 }

