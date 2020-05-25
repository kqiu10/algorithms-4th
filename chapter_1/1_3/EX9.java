import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class EX9{
    public static void main(String[] args){
  Stack<String> ops = new Stack<>();
  Stack<String> exp = new Stack<>();
  while(!StdIn.isEmpty())
  {
  String input = StdIn.readString();
  //push operations in operations stack
  if(input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")){
  ops.push(input);
  
  }else if(input.equals(")")){
  String op =ops.pop().toString();
  String opernd1 = exp.pop().toString();
  String opernd2 = exp.pop().toString();
  //stack LIFO
  String newExp = "(" + opernd2 + " " + op +" " + opernd1 + ")";
  //push new infix back to stack
  exp.push(newExp);
  }else{
  exp.push(input);
  }
  }
  while(!exp.isEmpty()){
  StdOut.print(exp.pop() +" ");
  }
    }
}

