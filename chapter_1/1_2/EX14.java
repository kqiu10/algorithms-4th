import edu.princeton.cs.algs4.Date;
public class EX14{
 private String customer; // customer
 private Date time; // date
 private double amount; // amount

 public EX14(String who, Date when, double amount) {
  this.customer = customer;
  this.time = time;
  this.amount = amount;
 }
    public boolean equals(Object obj){
        if(this == obj){
        return true;
        }
        if(obj == null){
        
        return false;
        }
        if(this.getClass() != obj.getClass()){
        return false;
        }
        EX14 that = (EX14) obj;
        if(!this.customer.equals(that.customer)){
        return false;
        }
        if(!this.time.equals(that.time)){
        return false;
        }
        if(!(this.amount != that.amount)){
        return false;}
        return true;
    }
    public static void main(String[] args){
    System.out.println("Vincent 5/23/2020 14".equals("Vincent 5/23/2020 14"));
    }

}