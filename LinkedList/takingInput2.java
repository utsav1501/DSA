package LinkedList;
import java.util.Scanner;

public class takingInput2 {
	public static Noode<Integer> takeInput2(){
		Noode<Integer> head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Noode<Integer> newnode=new Noode<Integer>(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void print(Noode<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Noode<Integer> head=takeInput2();
		print(head);
  }
}
