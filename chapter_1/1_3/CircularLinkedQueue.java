import java.util.Iterator;

public class CircularLinkedQueue{
    private class Node{
    Item item;
    Node next;
     public Node(){
    item = null;
    next = null;
    }
    }
   
    private Node last;
    private int N;
    public boolean isEmpty(){
    return N==0;
    }
    public int size(){return N;}
    public void enqueue(item item){
    Node old = last;
    last = new Node();
    last.item = item;
    //is it's an empty list
    if(isEmpty()){
        last.next = last;
    }else{
    last.next = old.next;
    old.next = last;}
    N++;
    }
    public Item dequeue(){
    Item remove = last.next.item;
    last.next = last.next.next;
    if(last.next == last){
    last = null;
    N--;
    return remove;
    }
    }
    
    }
