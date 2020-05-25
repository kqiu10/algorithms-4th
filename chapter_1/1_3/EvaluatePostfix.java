import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Stack;

public class EvaluatePostfix{
    public static void main(String[] args){
      Stack<Double> stack = new Stack<>();
      while(!StdIn.isEmpty()){
      String s = StdIn.readString();
      double result;
      switch (s){
          //if it's operation pop two elements from the stack, LIFO
          case "+":
              result = stack.pop() + stack.pop();
              stack.push(result);
              break;
          case "-":
              result = -stack.pop() + stack.pop();
              stack.push(result);
              break;
          case "/":
              result = 1 / stack.pop() * stack.pop();
              stack.push(result);
              break;
          case "*":
              result = stack.pop() * stack.pop();
              stack.push(result);
              break;
          default:
              stack.push(Double.parseDouble(s));
      
      }
      }
      System.out.println(stack.pop());
    }

}