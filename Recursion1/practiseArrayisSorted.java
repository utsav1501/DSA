package Recursion1;
import java.util.Scanner;
public class practiseArrayisSorted {
	public static boolean sort(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>=arr[1]) {
			return false;
		}
		int arr2[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			arr2[i-1]=arr[i];
		}
		boolean ans=sort(arr2);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		//Taking input in array arr
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Printing Array Elements
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		boolean ans=sort(arr);
			System.out.println(ans);
	}

}
