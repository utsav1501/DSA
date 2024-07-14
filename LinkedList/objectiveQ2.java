package LinkedList;

public class objectiveQ2 {
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
	    Noode<Integer> node3 = new Noode<Integer>(30);
	    Noode<Integer> node4 = new Noode<Integer>(40);
	    node1.next = node2;
	    node2.next = node3;
	    node3.next = node4;
	    print(node2);
	   }
}
