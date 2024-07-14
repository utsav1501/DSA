package LinkedList;

public class objectiveQ1 {
	public static void print(Noode<Integer> head){
	    Noode<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
	public static void main(String args[]){

	    Noode<Integer> node1 = new Noode<Integer>(10);
	    Noode<Integer> node2 = new Noode<Integer>(20);
	    node2.next = node1;
	    print(node2);
	   }
}
