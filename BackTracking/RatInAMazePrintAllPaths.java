package BackTracking;

//import LinkedList.print;

public class RatInAMazePrintAllPaths {
	public static void printSolution(int solution[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(solution[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void solveMaze(int maze[][],int solution[][],int x,int y,int n) {
		if(x==n-1 && y==n-1) {//last cell
			solution[x][y]=1;
			printSolution(solution, n);
			return ;
		}
		if(x>n-1 || x<0 || y>n-1 ||y<0 ||maze[x][y]==0 ||solution[x][y]==1) {
			return;
		}
		solution[x][y]=1;
		solveMaze(maze, solution, x-1, y, n);
		solveMaze(maze, solution, x+1, y, n);
		solveMaze(maze, solution, x, y-1, n);
		solveMaze(maze, solution, x, y+1, n);
		solution[x][y]=0;
	}
	public static void ratInAMaze(int maze[][],int n) {
		int [][] solution=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				solution[i][j]=0;
			}
		}
		solveMaze(maze, solution, 0, 0, n);
	}
	public static void main(String[] args) {
		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		int n=maze.length;
		ratInAMaze(maze,n);
	}
}
