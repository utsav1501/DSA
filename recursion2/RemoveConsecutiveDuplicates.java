/****************************Remove_Duplicates_Recusively*************************************/
package recursion2;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1){
			return s;
		}
		    if(s.charAt(0)==s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1));
		    }
		    
		    else {
			return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
		    }
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String ans=removeConsecutiveDuplicates(str);
	System.out.println(ans);
	}

}
