package Stack;
import java.util.Stack;
public class stack_in_collections {
	    public static void main (String[] args) {
	        Stack<Integer> stack=new Stack<Integer>();
	        stack.push(5);
	        stack.push(10);
	        stack.push(15);
	        System.out.println(stack.peek());
	        System.out.println(stack.pop()+stack.size());
	        System.out.println(stack.peek());
	    }
	}
