package Stack;
import java.util.Stack;
import java.util.Scanner;

public class Minimum_Bracket_Reversal {
	public static int countBracketReversals(String input) {
		  if(input.length()%2!=0){
          return -1;
      }
	Stack<Character> stack = new Stack<>();
	for(int i=0;i<input.length();i++) {
		
		if(input.charAt(i)=='{') {
			stack.push(input.charAt(i));
		}
		else if(input.charAt(i)=='}') {
			if(stack.isEmpty()) {
				stack.push(input.charAt(i));
			}
			else if(stack.peek()=='{') {
				stack.pop();
			}
			else {
				stack.push(input.charAt(i));
			}
		}
	}
	int count =0;
	while(!stack.isEmpty()) {
		char c1 = stack.pop();
		char c2 = stack.pop();
		System.out.println(c1);
		System.out.println(c2);
		if(c1==c2) {
			count++;
		}
		else {
			count+=2;
		}
	}
	return count;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		System.out.println(countBracketReversals(str));
	}

}
