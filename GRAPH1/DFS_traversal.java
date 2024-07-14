package GRAPH1;
import java.util.Scanner;
public class DFS_traversal {
	public static void printDFSHelper(int edges[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv]=true;
		int n=edges.length;
		for(int i=0;i<n;i++) {
			if(edges[sv][i]==1 && !visited[i]) {
				printDFSHelper(edges,i,visited);
			}
		}
	}
	
	public static void printDFS(int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		//System.out.println(edges.length); =5
		//printHelper(edges,sv,visited);
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {//jo jo visit nhi hua hai uspe call krenge
				printDFSHelper(edges,i,visited);
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
		printDFS(edges);
	}
}
