package recursion2;

public class printSubsequences {
	public static void printsubsequences(String input,String outputsofar) {
		if(input.length()==0) {
			System.out.println(outputsofar);
			return;
		}
		//we choose not to include first character
		printsubsequences(input.substring(1),outputsofar);
		//we choose to include first character
		printsubsequences(input.substring(1),outputsofar+input.charAt(0));
	}
	public static void printsubsequences(String str) {
		printsubsequences(str,"");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab";	
		printsubsequences(str);

	}

}
