package DP1;

public class BalanceBTs1 {
	public static long countBalanceBTs(int h) {
		if(h==0 || h==1) {
			return 1;
		}
		long x=countBalanceBTs(h-1);
		long y=countBalanceBTs(h-2);
		
		return x*x+2*x*y;
	}
	public static void main(String[] args) {
		int h=6;
		long ans=countBalanceBTs(h);
		System.out.println(ans);
	}
	//ye integer Range se bhar ja rha h so hum new program banainge
}
