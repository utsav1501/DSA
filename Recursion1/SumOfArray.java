package Recursion1;
import java.util.Scanner;

public class SumOfArray {
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0){
			return 0;
		}
		if(input.length==1){
			return input[0];
		}
		int arr[]=new int[input.length-1];
		for(int i=1;i<input.length;i++){
			arr[i-1]=input[i];
		}
		int result=sum(arr);
		System.out.println(input[0]+" " +result);
		return input[0]+result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		//Taking input in array arr
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=sum(arr);
		System.out.println(ans);
	}

}
