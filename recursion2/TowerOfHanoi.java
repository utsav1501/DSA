package recursion2;
import java.util.Scanner;
public class TowerOfHanoi {
	public static void TowerofHanoi(int n,char s,char h,char d) {
		if(n==1) {//If we have only one disk
			System.out.println("move 1st disk from "+s+" to "+d);
			return;
		}
		TowerofHanoi(n-1,s,d,h);
		System.out.println("move "+n+"th disk from "+s+" to "+d);
		TowerofHanoi(n-1,h,s,d);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		TowerofHanoi(n,'s','h','d'); //S->source  , h->helper  ,d->destination

	}

}
