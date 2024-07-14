package LinkedList;
import java.util.Scanner;
public class printReverse {
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
	public static void PrintReverse(Noode<Integer> head) {
		if(head==null) {//base case
			return;
		}
		PrintReverse(head.next);
		System.out.print(head.data+" ");
	}

	public static void main(String[] args) {
		Noode<Integer>head=takeInput();
		PrintReverse(head);
	}

}
