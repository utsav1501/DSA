package recursion2;
import java.util.Scanner;

public class ReturnKeypad {
	public static String[] keypad(int n) {
		if(n==0 || n==1) {
			String ans[]={""};
			return ans;
		}
		int newN=n%10;
		String ans[]=keypad(n/10);
		String helpans=helper(newN);
		String finalAns[]=new String[ans.length*helpans.length()];
		int k=0;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<helpans.length();j++) {
				finalAns[k]=ans[i]+helpans.charAt(j);
				k++;
			}
		}
		return finalAns;
	}
	public static String helper(int newN) {
		if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";
    }

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] ans=keypad(n);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
		}
	}

}
