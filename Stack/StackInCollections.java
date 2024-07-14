package Stack;

import java.util.Stack;

public class StackInCollections {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		int arr[]= {5,4,3,2};
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(!stack.empty()) {
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}
