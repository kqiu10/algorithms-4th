public class EX14{
 private String customer; // customer
 private Date time; // date
 private double amount; // amount

 public EX14(String who, Date when, double amount) {
  this.who = who;
  this.when = when;
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
        if(!this.who.equals(that.who)){
        return false;
        }
        if(!this.when.equals(that.when)){
        return false;
        }
        if(!this.amount != that.amount){
        return false;}
        return true;
    }
    public static void main(String[] args){
    System.out.println("Vincent 5/23/2020 14".equals("vincent 5/23/2020 14"));
    }

}