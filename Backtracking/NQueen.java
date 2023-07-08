//Variations in N Queen problem:
//Type 1: print all possible solutions - For this we print the board in base case
//Type 2: count no. of possible solutions - For this we increment static variable 'count' in base case
//Type 3: find if solution exists or not, if yes then print 1 solution
//      - For this we make the nQueen function as boolean type and change the return conditions

package Backtracking;

public class NQueen {

    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    //Time Complexity: O(n!)
    public static boolean nQueens(char board[][], int row) {
        //base case
        if (row == board.length) {
            count++;
            // printBoard(board);
            return true;
        }
        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; //backtracking step
            }
        }
        return false;
    }
    
    public static void printBoard(char board[][]) {
        System.out.println("--------CHESS BOARD--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else {
            System.out.println("Solution is NOT possible");
        }
        // System.out.println("total ways to solve n Queens: " + count);
    }
}
