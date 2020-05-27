public class remove{
    public void remove(LinkedList list, String key){
     Node node = list.getFirst();
     while(node != null){
     String data = node.next.item;
     if(data.equals(key)){
     node.next = node.next.next;
     }
     }
    
    }
    public String getFirst(){
    return first;
    }
}
