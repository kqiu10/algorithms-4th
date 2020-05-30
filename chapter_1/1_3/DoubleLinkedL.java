import java.util.Iterator;

public class DoubleLinkedL implements Iterable{
  private static DoubleNode first;
  private static DoubleNode last;
  private static int N;
  private class DoubleNode
  {
  Item item;
  DoubleNode next;
  DoubleNode prev;
  public DoubleNode(){
  item = null;
  next = null;
  prev = null;
  
  }
  
  }
  public static boolean isEmpty(){
  return N ==0;
  
  }
  public static int size(){
  return N;
  
  }
  public static void addBegin(String value){
  DoubleNode oldFirst = first;
  first = new DoubleNode();
  first.item = value;
  first.next = oldFirst;
  first.prev = null;
  if(oldFirst != null){
  oldFirst.prev = first;
  }
  if(last == null)last = first;
  N++;
  }
  public static void addLast(String value){
  DoubleNode oldLast = last;
  last = new DoubleNode();
  last.item = value;
  last.next = null;
  last.prev = oldLast;
  if(oldLast != null)
      oldLast.next = last;
  if(first == null)
      first = last;
  N++;
  
  }
  public static String removeFirst(){
  if(first == null)return null;
  String value = first.item;
  first = first.next;
  if(first != null)
   first.prev = null;
  else
  last = null;
  N--;
  return value;
  
  
  }
  


}