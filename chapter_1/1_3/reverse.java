public class reverse{
    public Node reverse(Node node){
    Node first = node;
    Node reverse = null;
    while(first != null)
    {
    Node second = first.next;
    first.next = reverse;
    reverse = first;
    first = second;
    
    }
    return reverse;
    
    
    }
    public Node reverseRecursion(Node first){
     if(first == null) return null;
        if(first.next == null)return first;
        Node second = first.next;
        Node rest = reverseRecursion(second);
        second.next = first;
        first.next = null;
        return rest;

    
    }
    
    
   
}