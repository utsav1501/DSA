package Recursion1;
import java.util.Scanner;
public class GeometricSum {
	public static double findGeometricSum(int n) {
		if(n==0) {
			return 1;
		}
		double process=1/Math.pow(2, n);
		return process+findGeometricSum(--n);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double d=findGeometricSum(n);
	System.out.println(d);
	}
}
