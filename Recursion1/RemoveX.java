package Recursion1;

import java.util.Scanner;

public class RemoveX {
	public static String removeX(String input) {
		//System.out.println(input);
		if(input.length()<=1) {
			if(input.charAt(0)=='x') {
				return "";
			}
			else {
				return input;			}
		}
		else if(input.charAt(0)=='x') {
			//input=input.substring(1);
			return removeX(input.substring(1));
		}
		return input.charAt(0)+removeX(input.substring(1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans=removeX(str);
		System.out.println(ans);

	}

}
