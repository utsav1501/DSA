package LinkedList;
import java.util.Scanner;

public class takingInput {
	public static Noode<Integer> takeInput()
	{
		Noode<Integer> head=null,tail=null;//yha pe noode class ka object bna rhe hai isliye Noode class me phle jaiga
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		
		while(data!=-1) {
			//System.out.println("hi");
			Noode<Integer> newNode=new Noode<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;//for making connection between nodes
				tail=newNode;//Important step
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
		Noode<Integer> head=takeInput();
		print(head);
		
	}
}
