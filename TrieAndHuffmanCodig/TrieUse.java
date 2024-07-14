package TrieAndHuffmanCodig;

public class TrieUse {
	public static void main(String[] args) {
		TrieImplementation t=new TrieImplementation();
		t.add("this");
		t.add("news");
		System.out.println(t.search("new"));
	}
}
