package Recursion1;
import java.util.Scanner;

public class StringToInteger {
	public static int convertStringToInt(String input){
		//System.out.println(input);
		if(input.length()==1) {
			return input.charAt(0)-'0';
		}
		int store=input.charAt(input.length()-1)-'0';
		//System.out.println(input.length());
		return store+(10*convertStringToInt(input.substring(0,input.length()-1)));

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=convertStringToInt(str);
		System.out.println(ans);
		System.out.println("hi");
		
/*		Here,we just checking that how substring(strtIndex) and substring(strtInd,endInd) works...
		String p="abc";
		//System.out.println(p.substring(0, 2));
		System.out.println(p.substring(1));
 */

		}

}
