package Recursion1;
import java.util.Scanner;

public class NumberOfDigits {
	public static int say(int n) {
		if(n==0) {          //base case
			return 0;
		}
		 return 1+say(n/10);
		

		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
																										
		int n=sc.nextInt();
		int ans=say(n);
			System.out.println(ans);
	}
	
}
