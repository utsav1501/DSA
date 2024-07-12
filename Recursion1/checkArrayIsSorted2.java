/****************HereWeSortArrayByAnotherMethod***********************/
package Recursion1;

public class checkArrayIsSorted2 {
public static boolean checkSorted_2(int input[]){
		
		if(input.length <= 1){				//Base case1
			return true;
		}
		if(input[0] > input[1]){			//Base case2
			return false;
		}
		 
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		boolean smallAns = checkSorted_2(smallInput);
		return smallAns;
}
	public static void main(String[] args) {
		int input[] = {1,5,3};
		System.out.println(checkSorted_2(input));

	}
}
