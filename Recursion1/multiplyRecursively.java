package Recursion1;
import java.util.Scanner;
public class multiplyRecursively {
	public static int ans(int m,int n){
		if(n==1) {
			return m;
		}
		if(n==0) {
			return 0;
		}
		return m+ans(m,n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(ans(m,n));

	}

}
