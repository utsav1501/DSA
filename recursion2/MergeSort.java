package recursion2;
public class MergeSort {
    public static void merge(int[] arr , int s , int e){
        int mid = (s + e)/2;
        int len1 = mid - s + 1; //length of first half
       // System.out.println(len1);
        int len2 = e - mid; //length of second half
        //System.out.println(len2);
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        //copy elements in these arrays;
        int originalArrayIndex = s;
        for(int i = 0; i < len1; i++){
            arr1[i] = arr[originalArrayIndex];
            originalArrayIndex++;
        }

       originalArrayIndex = mid + 1;

        for(int i = 0; i < len2; i++){
            arr2[i] = arr[originalArrayIndex];
            originalArrayIndex++;
        }

        //merge two sorted arrays;
        originalArrayIndex = s;

        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < len1 && idx2 < len2){
            if(arr1[idx1] < arr2[idx2]){
                arr[originalArrayIndex++] = arr1[idx1++];
            }
            else {
                arr[originalArrayIndex++] = arr2[idx2++];
            }
        }

        //if in arr1 elements are remaining
        while(idx1 < len1){
            arr[originalArrayIndex++] = arr1[idx1++];
        }
        //if in arr2 elements are remaining
        while(idx2 < len2){
            arr[originalArrayIndex++] = arr2[idx2++];
        }
    }
	 public static void mergeSort(int[] arr , int s , int e) {
		 //System.out.println();
	        //base case
	        if(s >= e) {
	        	//System.out.println("hi"+s);
	        	//System.out.println(arr[0]);
	        	return;
	            }
	        int mid = (s + e)/2;
	        //left Part sort karna hai
	        mergeSort(arr , s , mid);
/*****************************Funcn_kse_kam_kar_rha_hai_wo_dekhe***************************/	        
//	         for(int i=0;i<=e;i++) {
//	    		System.out.print(arr[i]+" ");
//	    	}
//	        System.out.println();
/************************right part sort karna hai***************************/
	        //System.out.println(mid+" "+e);
	        mergeSort(arr , mid + 1 , e);
/*****************************Funcn_kse_kam_kar_rha_hai_wo_dekhe***************************/
//	        for(int i=0;i<=e;i++) {
//	    		System.out.print(arr[i]+" ");
//	    	}
//	        System.out.println();
/**********************************************************************************************/	        
	      //merge karte hai
//	        System.out.println(s+" "+e);
	        merge(arr , s , e);
//	        System.out.println("aya kya");
	    }

public static void main(String[] args) {
    int[] arr = {8 , 9 , 2 , 5 , 1};
    int size = 5;

    System.out.println("Before Sorting");

    for(int i = 0; i < size; i++){
        System.out.print(arr[i] + " ");
    }
    	System.out.println();
    mergeSort(arr , 0 , size - 1);
    System.out.println("After Sorting");
    for(int i = 0; i < size; i++){
        System.out.print(arr[i] + " ");
    }

}
}
