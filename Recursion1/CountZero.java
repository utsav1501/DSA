package Recursion1;
import java.util.Scanner;

public class CountZero {
	public static int countZero(int input){
//		System.out.println(input);
		int count=0;
		if(count==0 && input==0){
			return 0;
		}
		if(input==0 && count!=0){
			//System.out.println(count);
			return count;
		}
		//System.out.println(count+" "+input);
		if(input%10==0) {
			count++;
		}
		//System.out.println(input);
		input=input/10;
		//System.out.println(count);
		//System.out.print(input+" ");
		return count+countZero(input);
//		System.out.println(count);
//		return count;
	}

	public static int countZerosRec(int input){
		if(input==0) {//agar input sirf 0 ho tb
			return 1;
		}
		int ans=countZero(input);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=countZerosRec(n);
		System.out.println(ans);

	}

}
