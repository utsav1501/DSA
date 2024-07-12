package Recursion1;

public class sortArrayBetter {

	public static boolean sortedBetter(int arr[],int stIndex) {
		if(stIndex>=arr.length-1) {		//(arr.length-1) hum liye hai kyo ki last element already sorted hoga
			return true;
		}
		if(arr[stIndex]>arr[stIndex+1]) {
			return false;
		}
		boolean ans=sortedBetter(arr,stIndex+1);
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		System.out.println(sortedBetter(arr,0));
	}

}
