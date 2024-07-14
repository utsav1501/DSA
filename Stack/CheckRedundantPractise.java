package Stack;
import java.util.Stack;
import java.util.Scanner;

public class CheckRedundantPractise {
	public static boolean checkRedundantBrackets(String str) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==')') {
				int count=0;
				while(stack.peek()!='(') {
					count++;
					stack.pop();
				}
				stack.pop();//isko '(' pop kr rhe h
				if(count==0 || count==1) {
					return true;//matlab redundant hai
				}
			}
			else {
				stack.push(str.charAt(i));
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
