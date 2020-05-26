public class findLinkedList{
    private boolean find(String key){
        if(isEmpty()){
        return false;
        }
       Node node =first;
       while(node != null){
       String result = node.item;
       if(result.equals(key)){
       return true;
       node = node.next;
       
       }
       return false;
       }
    
    
    }
}