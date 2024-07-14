package HashMap;

public class MapNode<K ,V> {
	K key;
	V value;
	MapNode<K,V> next;//LL traverse karne ke liye
	
	public MapNode(K key,V value) {
		this.key=key;
		this.value=value;
	}
}
