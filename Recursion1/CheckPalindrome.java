package Recursion1;
import java.util.Scanner;
public class CheckPalindrome {
	public static boolean isStringPalindrome(String input) {
		//System.out.println(input);
		if(input.length()<=1){
			return true;
		}
		else  if(input.charAt(0)!=input.charAt(input.length()-1)){
			//System.out.println(input+" "+input.charAt(0)+" "+input.charAt(input.length()-1));
			return false;
		}
		return isStringPalindrome(input.substring(1, input.length()-1));

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean ans=isStringPalindrome(str);
		System.out.println(ans);
	}

}
