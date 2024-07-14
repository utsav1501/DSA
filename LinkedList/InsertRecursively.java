package LinkedList;

import java.util.Scanner;

public class InsertRecursively {
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
	public static Noode<Integer> insert(Noode<Integer> head,int pos,int element){
		if(pos==0) {
			Noode<Integer> newNode=new Noode<Integer>(element);
			newNode.next=head;
			return newNode;
		}
		if(head==null) {
			return head;
		}
		head.next=insert(head.next,pos-1,element);
		return head;
	}

	public static void main(String[] args) {
		Noode<Integer> head=takeInput();
		head=insert(head,2,10);
		print(head);

	}

}
