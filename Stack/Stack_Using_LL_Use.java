package Stack;

public class Stack_Using_LL_Use {
	public static void main(String[] args) {
		Stack_Using_LL<Integer> stack=new Stack_Using_LL<Integer>();
		for(int i = 1; i <= 10; i++){
			stack.push(i);
		}
		
		while(!stack.isEmpty()){
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never reach here
			}
		}
	}
}
