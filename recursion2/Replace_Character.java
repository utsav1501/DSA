package recursion2;
import java.util.Scanner;

public class Replace_Character {
	public static String replace(String input,char ch1,char ch2) {	
		String store = "";
		if(input.length()==1) {
			if(input.charAt(0)==ch1) {
				store=store+ch2;
			return store;
		}
			else {
				return input;
			}
		}
		char contain=0;
		if(input.charAt(0)==ch1) {
	    input.replace(input.charAt(0),ch2);
		contain=ch2;
		}
		if(input.charAt(0)!=ch1) {
			contain=input.charAt(0);
		}
		return contain+replace(input.substring(1),ch1,ch2);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		String ans=replace(input,ch1,ch2);
		System.out.println(ans);
	}

}
