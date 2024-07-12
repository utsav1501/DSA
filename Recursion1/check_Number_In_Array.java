package Recursion1;
import java.util.Scanner;

public class check_Number_In_Array {
	public static boolean checkNumber(int input[],int x) {
		if(input.length==0){
			return false;
		}
		if(input[0]==x){
			return true;
		}
		int arr[]=new int[input.length-1];
		for(int i=1;i<input.length;i++){
			arr[i-1]=input[i];
		}
		
		boolean result=checkNumber(arr,x);
		return result;
	}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n = sc.nextInt();
			int input[] = new int[n];
			for(int i = 0; i < n; i++) {
				input[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			System.out.println(checkNumber(input, x));
		}
	}
