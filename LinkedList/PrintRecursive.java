package LinkedList;

import java.util.Scanner;
public class PrintRecursive {
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
	public static void PrintR(Noode<Integer> head) {
		if(head==null) {//base case
			return;
		}
		System.out.print(head.data+" ");
		PrintR(head.next);
	}
	public static void main(String[] args) {
		Noode<Integer> head=takeInput();
		PrintR(head);

	}

}
