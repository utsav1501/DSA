package Stack;

public class StackUse extends StackFull {
	public static void main(String[] args) throws Exception {
		StackUsingArrays stack=new StackUsingArrays();
		for(int i=1;i<=5;i++) {
			stack.push(i);
	}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(4);
//		stack.push(5);
//		stack.push(6);
//		System.out.println(stack.pop());
	}
}
