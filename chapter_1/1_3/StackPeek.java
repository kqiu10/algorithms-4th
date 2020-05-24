import edu.princeton.cs.algs4.Stack;

public class StackPeek{
   private Node first;
   private int N;
   private class Node{
   Item item;
   Node next;
   }
   public Item peek(){
       if(!Stack.isEmpty()){
       Item item = first.item;
       return item;
       }
   
   }


}