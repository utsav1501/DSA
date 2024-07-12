package Recursion1;
import java.util.Scanner;

public class SumOfDigits {
	public static int sumDigits(int n) {
		if(n==0) {
			return 0;
		}
		int count=0;
		count=n%10;
		n=n/10;
		return count+sumDigits(n);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=sumDigits(n);
		System.out.println(ans);
	}

}
