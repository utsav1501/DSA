package DP2;

public class EditDistanceRecursive {
	public static int editDistance(String s,String t) {
		if(s.length()==0) {
			return t.length();
		}
		if(t.length()==0) {
			return s.length();
		}
		if(s.charAt(0)==t.charAt(0)) {
			return editDistance(s.substring(1), t.substring(1));
		}
		else {
			//insert 
			int op1=editDistance(s, t.substring(1));
			//delete 
			int op2=editDistance(s.substring(1),t);
			//substitute
			int op3=editDistance(s.substring(1),t.substring(1));
			return 1+Math.min(op1,Math.min(op2, op3));
		}
	}
	public static void main(String[] args) {
		String s="ade";
		String t="gbe";
		System.out.println(editDistance(s, t));
	}
}
