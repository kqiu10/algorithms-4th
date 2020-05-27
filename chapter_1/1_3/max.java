public class max{
    public String max(LinkedList list){
    Node node = list.getFirst();
    String max = node.item;
    while(node != null){
        if(node.item> max){
        max = node.item;
        
        }
        node = node.next;
    }
    
    }


}


