package recursion2;
import java.util.Scanner;
public class BinarySearch {
    public static int helper(int arr[],int st,int end,int x){
        if(st>end){
            return -1;
        }
        int mid=(st+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){               //Right wale part me jana hai
           return  helper(arr, mid+1,end,x);
        }
        else{
            return helper(arr, st,mid-1,x);
        }
    }

    public static int binarySearch(int[] arr, int x) {
    	int st=0;
        int end=arr.length-1;
       int ans= helper(arr,st,end,x);
       return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(binarySearch(arr,x));

	}

}
