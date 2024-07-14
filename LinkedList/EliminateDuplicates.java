package LinkedList;

import java.util.Scanner;

public class EliminateDuplicates {
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
	public static Noode<Integer> removeDuplicates(Noode<Integer> head) {
	    {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        Noode<Integer> t1=head,t2=head.next;
        Noode<Integer> finalhead=head;
        while(t2!=null){
            if(t1.data.equals(t2.data))
            {
                t2=t2.next; 
            }
            else{
            	System.out.println(t1.next);
            	System.out.println(head);
            	System.out.println(t2);
            	System.out.println(t1.data);
                t1.next=t2;
                t1=t2;
                
            }
        }

        t1.next=null;
        return finalhead;
   		 }

	}
	public static void main(String[] args) {
		Noode<Integer>head=takeInput();
//		Noode<Integer>tail=removeDuplicates(head);
//		print(tail);
		removeDuplicates(head);
		print(head);
	}
}
