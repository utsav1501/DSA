package Stack;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String expression) {
	  Stack<Character> stack=new Stack<>();
	 // System.out.println(stack.isEmpty());
      for (int j=0;j<expression.length();j++)
      {
          char i=expression.charAt(j);
          if (i=='[' || i=='{' || i=='(')
          {
              stack.push(i);
          }
          else if(i==']' || i=='}' || i==')')
          {
              if (stack.isEmpty())
                  return false;
              
              else
              {
                  if (i==']')
                  {
                      if (stack.peek()!='[')
                          return false;
                      else
                          stack.pop();
                  }
                  
                  else if (i=='}')
                  {
                      if (stack.peek()!='{')
                          return false;
                      else
                          stack.pop();
                  }
                  
                  else if (i==')')
                  {
                      if (stack.peek()!='(')
                          return false;
                      else
                          stack.pop();
                  }
              }
          }
      }
      return stack.isEmpty();
      
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		System.out.println(isBalanced(str));
	}

}
