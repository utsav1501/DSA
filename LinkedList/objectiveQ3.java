package LinkedList;

public class objectiveQ3 {
	 public static void print(Noode<Integer> head){
		    Noode<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
		}
	 public static void increment(Noode<Integer> head){
		    //Noode<Integer> temp =new Noode<Integer>(100);//yha pe change ho rha hai kyo ki yha new Node ban rha hai
		    Noode<Integer> temp=head;
 		    while(temp != null){
		        temp.data++;
		        temp = temp.next;
		    }
		}
	 public static void main(String args[]){

		    Noode<Integer> node1 = new Noode<Integer>(10);
		    Noode<Integer> node2 = new Noode<Integer>(20);
		    node1.next = node2;
		    increment(node1);
		    print(node1);
		   }
}
