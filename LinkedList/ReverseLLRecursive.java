package LinkedList;

import java.util.Scanner;

public class ReverseLLRecursive {
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
	public static Noode<Integer> reverseLinkedListRec(Noode<Integer> head) {
		if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
       Noode<Integer> finalhead=reverseLinkedListRec(head.next);
       Noode<Integer> temp=finalhead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        //System.out.println(head.data);
        head.next=null;
        return finalhead;
	}

	public static void main(String[] args) {
		Noode<Integer> head=takeInput();
		head=reverseLinkedListRec(head);
		print(head);

	}

}
