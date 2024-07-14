package HashMap;

public class MapUSe {
	public static void main(String[] args) {
		Map<String,Integer> map=new Map<>();
		for(int i=0;i<20;i++) {
			map.insert("abc"+i,1+i);
			System.out.println("i="+i+" Lf="+map.loadFactor());
		}
		
		
		for(int i=0;i<20;i++) {
			System.out.println("abc"+i+":"+map.getValue("abc"+i));
		}
	}
}
