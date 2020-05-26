public class EX20{
    public Item delete(Int k){
        if(k<1 || k>N){
        return null;    
        }
        if(k == 1){
        Item result = first.item;
        return result;
        }
        for(i =1 ;i<k;i++){
        Item result = node.item;
        node = node.next;
        node.next = node.next.next;
        //shrink the size of linkedlist
        --N;
        return result;
        }
    
    }



}