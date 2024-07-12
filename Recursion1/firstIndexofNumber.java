package Recursion1;

public class firstIndexofNumber {
	public static int find(int input[],int x,int i){
		if(i>input.length-1){
			return -1;
		}
		if(input[i]==x){
			return i;
		}
		int wapas=find(input,x,i+1);
		return wapas;
	}
	public static int firstIndex(int input[], int x) {
		if(input.length==0) {
			return -1;
		}
		return find(input,x,0);
	}
	public static void main(String[] args) {
		int arr[]= {21 ,22, 46, 12 ,61, 21, 33, 16, 99, 96 };
		int x=25;
		int ans=firstIndex(arr,x);
		System.out.println(ans);
	}

}
