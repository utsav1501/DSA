package LinkedList;

import java.util.Scanner;
public class LengthOfLL {
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
	public static int length(Noode<Integer> head){
		Noode<Integer> temp=head;
//		System.out.println(head);
//		System.out.println(temp);
		if(head==null){
			return 0;
		}
		int count=1;
		while(temp.next!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Noode<Integer>head=takeInput();
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int res=length(head);
		System.out.println(res);
	}

}
