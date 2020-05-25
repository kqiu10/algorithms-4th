import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class InfixToPostfix{
    public static void main(String[] args){
    Stack<String> stack = new Stack<>();
    while(!StdIn.isEmpty()){
    String s = StdIn.readString();
    switch(s){
        case "+":
        case "-":
        case "*":
        case "/":
            stack.push(s);
            break;
        case "(":
            break;
        case ")":
            System.out.print(stack.pop() + " ");
            break;
        default:
            System.out.print(s + " ");
    
    }
    }
    System.out.println();
    }
    
    



}