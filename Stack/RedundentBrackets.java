package Stack;
import java.util.Stack;
import java.util.Scanner;

public class RedundentBrackets {
	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++) {

			if(expression.charAt(i)==')') {
				int count =0;
				while(stack.peek()!='(' ) {
					count++;
					System.out.println(stack.peek());
					stack.pop();
				}
				stack.pop();
				if(count==0||count==1) {
					return true;//means redundant hai
				}
			}
			else {
				stack.push(expression.charAt(i));
			}

		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		System.out.println(checkRedundantBrackets(str));
	}

}
