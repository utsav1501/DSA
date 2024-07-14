package DP2;

public class LCSrecursive {
	public static int LCS(String s,String t) {
		if(s.length()==0 || t.length()==0) {
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)) {//1st character matched of both strings
			return 1+LCS(s.substring(1),t.substring(1));
		}
		else {
			int op1=LCS(s,t.substring(1));
			int op2=LCS(s.substring(1),t);
			//int op3=LCS(s.substring(1),t.substring(1));
//			return Math.max(op1,Math.max(op2, op3));
			return Math.max(op1,op2);
		}
	}
	public static void main(String[] args) {
		String s="dgei";
		String t="begi";
		System.out.println(LCS(s,t));
	}
}
