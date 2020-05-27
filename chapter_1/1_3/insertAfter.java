public class insertAfter{
    private void insertAfter(Node node1, Node node2){
    
        if(node1 == null || node2 == null){
        return;
        }
    }
    Node temp = node1.next;
    node1.next = node2;
    node2.next = temp;
    //increaser size of list
    N++;


}