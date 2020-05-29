public class reverse{
    public Node reverse(Node node){
    Node first = x;
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


}