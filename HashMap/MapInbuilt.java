package HashMap;
import java.util.HashMap;
import java.util.Set;  
public class MapInbuilt {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();//map ke gazah kuch bhi nam rakh sakte hai
		//Insertion
		map.put("abc",1);
		map.put("def", 2);
		System.out.println("size ="+map.size());
		
//		map.put("abc", 10);
//		map.put("def",20);
//		System.out.println("Size ="+map.size());
		//Here we are just updating the data so its size will be same
		
		map.put("abc1", 1);
		map.put("def1",2);
		System.out.println("Size ="+map.size());
		
		
		//check Presence
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		
		if(map.containsKey("abc1")) {
			System.out.println("Has abc1");
		}
		
		if(map.containsValue(2)) {     //take O(n) complexity bcz if we work upon Value then we will get complexity O(n)
			System.out.println("Has 2 as value");
		}
		
		
		//get Value    //gives value corresponding to key
//		int v=map.get("abc1");
//		System.out.println(v);
		
		
		int v=0;
		if(map.containsKey("def1")) {
			v=map.get("abc1"); 
		}
		System.out.println(v);
		
		//remove
		int s=map.remove("abc");
		System.out.println("deleted Value ="+s);
		
		
		//iterate
		Set<String> keys=map.keySet();
		//KeySet return all the keys in a dateType called set
		for(String str:keys) {
			System.out.println(str);
		}
	}
}
