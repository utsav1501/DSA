package LinkedList;

import java.util.Scanner;
public class midpointOfLL {
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
	public static Noode<Integer> midpoint(Noode<Integer>head){
		Noode<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Noode<Integer> head=takeInput();
		Noode<Integer> mid=midpoint(head);
		System.out.println(mid.data);

	}

}
