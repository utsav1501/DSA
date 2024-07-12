package Recursion1;
import java.util.Scanner;

public class LastIndexOfNumber {
	public static int find(int arr[],int x,int index,int count) {
		if(index>arr.length-1) {	//BaseCase
			if(count==0) {
				return -1;
			}
			else {
			return count;
			}
		}
		if(arr[index]==x) {
			count=index;
			//System.out.println(count);
		}
		int ans=find(arr,x,index+1,count);
		return ans;
	}
	public static int lastIndex(int input[],int x) {
		int count=0;
		int ans=find(input,x,0,count);
		return ans;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n=s.nextInt();
		 int[] input = new int[n];
		 for(int i=0;i<n;i++) {
			 input[i]=s.nextInt();
		 }
		 int x = s.nextInt();
		 System.out.println(lastIndex(input,x));
	}

}
