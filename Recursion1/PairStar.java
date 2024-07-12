package Recursion1;
import java.util.Scanner;
public class PairStar {
	    public static String pairStar(String str) {

	        if (str.length()<=1) return str;

	        if (str.charAt(0) == str.charAt(1))
	            return str.charAt(0) + "*" + pairStar(str.substring(1));


	        return str.charAt(0) + pairStar(str.substring(1));
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans=pairStar(str);
		System.out.println(ans);

	}

}
