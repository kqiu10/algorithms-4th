

public class EX19{
    
    public Integer RemoveLast(){
    
    Item last = null;
    if(isEmpty()){
    return last;
    }
    if(first.next == null){
    return first.item;
    N--;
    }
    Node node = first;
    while(node.next.next != null)
    {
    node = node.next;
    last = node.next.item;
    node.next = null;
    
    return last;
        
    }
    }

}