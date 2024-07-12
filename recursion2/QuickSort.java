package recursion2;
import java.util.Scanner;

public class QuickSort {
	public static int Partition(int a[],int l,int u){
	    int pivot=a[u];
	    int pIndex=l;
	    
	    for(int i=l;i<u;i++){
	        
	        if(pivot>a[i]){
	            int temp=a[pIndex];
	            a[pIndex]=a[i];
	            a[i]=temp;
	            pIndex++;
	        }
	    }
	    int temp=a[pIndex];
	    a[pIndex]=a[u];
	    a[u]=temp;
	    return pIndex;
	}


	public static void qS(int a[],int l,int u){
	    if(l<u){
	        int pIndex=Partition(a,l,u);
	        qS(a,l,pIndex-1);
	        qS(a,pIndex+1,u);
	    }
	}
	public static void QuickSort(int input[], int size) {
		    qS(input,0,size-1);
		}
	

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 //Taking input
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 //printing input
//	 for(int i=0;i<n;i++) {
//		 System.out.print(arr[i]+" ");
//	 }
	 QuickSort(arr,n);
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }

	}

}
