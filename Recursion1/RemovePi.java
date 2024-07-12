package Recursion1;

import java.util.Scanner;

public class RemovePi {
	 public static String replace(String input)  {
		 	//System.out.println(input);
	        if(input.length()==1 || input.length()==0) {
	        	//System.out.println(input.length()+" "+input.charAt(0));
	            return input;
	        }
	        String smallans=replace(input.substring(1));
//	        System.out.println(smallans);
	      // System.out.println(smallans+" "+input.charAt(0));
	        if(smallans.charAt(0)=='i' && input.charAt(0)=='p') {
	            smallans="3.14" + smallans.substring(1);
	            //System.out.println(smallans);
	        }
	        else
//	        	System.out.println(input.charAt(0));
            smallans=input.charAt(0)+smallans;
//	        System.out.println(smallans);
	        return smallans;

	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans=replace(str);
		System.out.println(ans);

	}

}
