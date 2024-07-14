package BackTracking;
public class Rat_In_A_Maze {
	public static boolean ratInAMaze(int maze[][]) {
		int n=maze.length;
		int path[][]=new int[n][n];
		return solveMaze(maze,0,0,path);
	}
	public static boolean solveMaze(int maze[][],int i,int j,int path[][]) {
		int n=maze.length;
		//check if i,j cell is valid or not
		if(i<0 || i>=n || j<0 ||j>=n ||maze[i][j]==0 || path[i][j]==1) {
			return false;
		}
		//Include the cell in current path
		path[i][j]=1;
		//Destination cell
		if(i==n-1 && j==n-1) {
			for(int row=0;row<n;row++) {
				for(int column=0;column<n;column++) {
					System.out.print(path[row][column]+" ");
				}
				System.out.println();
			}
			return true;
		}
		//Explore further in all directions
		boolean pathPossible=false;
		//top
		if(solveMaze(maze, i-1, j, path)) {
			pathPossible=true;
		}
		//right
		if(solveMaze(maze, i, j+1, path)) {
			pathPossible=true;
		}
		//Down
		if(solveMaze(maze, i+1, j, path)) {
			pathPossible=true;
		}
		//left
		if(solveMaze(maze, i, j-1, path)) {
			pathPossible=true;
		}
		return pathPossible;
	}
	public static void main(String[] args) {
	int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};//true
//      int maze[][]= {{1,1,0},{1,0,1},{0,1,1}};//false
		boolean pathPossible=ratInAMaze(maze);
		System.out.println(pathPossible);
	}
};