public class Spiral {
    public static void spiralTraversal(int matrix[][]) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endRow) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                //for single row case
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for (int i = endRow - 1; i > startRow; i--) {
                //for single column case
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4},
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };
                           
        int matrix2[][] = { { 1, 2, 3, 4 } };

        int matrix3[][] = { { 1, 2 },
                            { 3, 4 }, 
                            { 5, 6 } };
                            
        spiralTraversal(matrix3);
    }
}
