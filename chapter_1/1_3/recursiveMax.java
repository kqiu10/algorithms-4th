public class recursiveMax{
public Integer recursiveMax(){
    if(isEmpty()){
    return 0;
    }
    return (recursivemax(first,0));


}
private Integer recursiveMax(Node node, Integer max){
 if(node == null)return max;
 Integer current = node.item;
 if(current >max) max = current;
 return recursiveMax(node.next,max);
 
 

}

}

