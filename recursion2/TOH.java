package recursion2;

import java.util.Scanner;

public class TOH {
	public static void TowerofHanoi(int n,String Source,String Helper ,String Destination ) {
		if(n==1) {
			System.out.println("Transfer disk from "+Source+" to "+ Destination);
			return ;
		}
		TowerofHanoi(n-1,Source,Destination,Helper);
		System.out.println("Transfer disk "+n+" from "+Source+" to "+Destination);
		//Ab helper me se destination me dalna hai using source
		TowerofHanoi(n-1,Helper,Source,Destination);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		TowerofHanoi(n,"source","helper","destination"); //S->source  , h->helper  ,d->destination


	}

}
