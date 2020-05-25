import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
public class StackCopy{  
    public static Stack copy(Stack<String> origin){
        Stack<String> copy = new Stack<>();
        for(String s :  origin)
            copy.push(s);
        return copy;   
    }
    public static void main(String[] args){
    Stack<String> stack = new Stack<>();
    while(!StdIn.isEmpty()){
    String s = StdIn.readString();
    stack.push(s);
    Stack<String> newstack =copy(stack);
    StdOut.println("the origin stack is");
    StdOut.println(stack);
    StdOut.println(newstack);   
    }   
    }
 
}