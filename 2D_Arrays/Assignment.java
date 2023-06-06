
public class Assignment {

    //Question 1
    public static void countKey(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    //Question 3
    public static void transpose(int matrix[][]) {
        printMatrix(matrix);

        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 7, 4},
                           { 5, 10, 30, 45 },
                           { 7, 29, 7, 48 },
                           { 36, 23, 19, 5 } };                  
        //Question 1
        int key = 7;
        countKey(matrix, key);

        //Question 2
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[1][i];
        }
        System.out.println(sum);

        //Question 3
        int matrix2[][] = { { 1, 2, 7, 4},
                            { 5, 10, 30, 45 } };  
        transpose(matrix2);
    }
}
