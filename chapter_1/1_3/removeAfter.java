public class removeAfter{

    public String removeAfter(String node){
        //edge case
        if(node == null || node.next == null){
        return null;
        }
        String afterNode = node.next.item;
        node.next = node.next.next;
        --N;   
    }


}