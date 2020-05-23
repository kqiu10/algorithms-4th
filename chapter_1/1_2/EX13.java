public class EX13 {

 private String who; // customer
 private Date when; // date
 private double amount; // amount

 public EX13(String who, Date when, double amount) {
  this.who = who;
  this.when = when;
  this.amount = amount;
 }
 
 
 public static void main(String[] args) {
  Transaction transaction = new EX13("Vincent", new Date(5, 23, 2020), 15);

  System.out.println(transaction);
 }
}