package Recursion1;
import java.util.Scanner;
public class Print1toN {
	public static void print(int n) {
		if(n==0){
			//System.out.print(n);
			return;
		}
		// System.out.print(count);
		// count++;
		print(n-1);
		System.out.print(n+" ");
	}
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			print(n);
		}
		
	}
