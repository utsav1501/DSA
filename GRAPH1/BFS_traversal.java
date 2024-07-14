package GRAPH1;

import java.util.Scanner;

import Queue.QueueEmptyException;

public class BFS_traversal {
	public static void printBFSHelper(int edges[][],int sv,boolean visited[]) {
		QueueUsingLL1<Integer> q=new QueueUsingLL1<>();
		q.enqueue(sv);
		int n=edges.length;
		visited[sv]=true;
		while(!q.isEmpty()) {
			int front;
			try {
				front = q.dequeue();
			} catch (QueueEmptyException e) {
				return;
			}
			System.out.println(front);
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					q.enqueue(i);
					visited[i]=true;
				}
			}
		}
	}
	public static void BFS(int edges[][]) {
		boolean visited[]=new boolean[edges.length];//we are making visited array to reduce redundant call
		//printBFSHelper(edges, 0, visited); if graph is not seperated we will use this
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {
				printBFSHelper(edges, i, visited);
			}
		}
	}
	public static void main(String[] args) {
		int n;//vertices
		int e;//edge
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		e=sc.nextInt();
		int edges[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=sc.nextInt();//first vertex
			int sv=sc.nextInt();//second vertex
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		BFS(edges);
	}
}
