package LinkedList;
import java.util.Scanner;
public class reverseLLBetter {
	public static Noode<Integer> takeInput(){
		Noode<Integer>head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Noode<Integer> newNode=new Noode<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
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
	
	
	public static Noode<Integer> reverseLL(Noode<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		Noode<Integer> tail=head.next;//yha pe tail 2 ko point kr rha hoga (if our LL be 1->2->3->4) bcz recursion gives output 4->3->2.
		Noode<Integer> smallhead=reverseLL(head.next);//recursion gives 4->3->2(suppose)
		tail.next=head;//hum 2 me 1 ko insert kr diye before(4->3->2 ) and after (4->3->2->1->null).
		head.next=null;
		
		return smallhead;
	}
	
	public static void main(String[] args) {
	Noode<Integer> head=takeInput();	
	head=reverseLL(head);
	print(head);
	}

}
