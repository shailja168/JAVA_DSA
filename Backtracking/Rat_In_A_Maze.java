package Backtracking;

public class Rat_In_A_Maze {

    public static boolean isSafe(int maze[][], int x, int y) {
        return (x < maze.length && x < maze.length && maze[x][y] == 1);
    }

    //Time Complexity: O(2^n)
    public static boolean ratInMaze(int maze[][], int ans[][], int x, int y) {
        //base case
        if (x == maze.length - 1 && y == maze.length - 1) {
            ans[x][y] = 1;
            return true;
        }

        //recursion
        if (isSafe(maze, x, y)) {
            ans[x][y] = 1;
            if (ratInMaze(maze, ans, x + 1, y)) {
                return true;
            }
            if (ratInMaze(maze, ans, x, y + 1)) {
                return true;
            }
            ans[x][y] = 0;  //backtracking
            return false;
        }

        return false;      
    }
    
    public static void printMaze(int ans[][]) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int maze[][] = {{ 1, 0, 0, 0 },
                        { 1, 1, 1, 0 }, 
                        { 0, 0, 1, 0 }, 
                        { 1, 1, 1, 1 } };
        
        int n = maze.length;
        int ans[][] = new int[n][n];

        if (ratInMaze(maze, ans, 0, 0)) {
            System.out.println("Solution exists");
            printMaze(ans);
        }
        else {
            System.out.println("Solution does not exists");
        }
    }
}
