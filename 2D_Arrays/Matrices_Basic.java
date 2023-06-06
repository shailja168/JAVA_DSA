import java.util.Scanner;

public class Matrices_Basic {

    public static void minMax(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                smallest = Math.min(smallest, matrix[i][j]);
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        System.out.println("\nLargest element: " + largest + "\nSmallest element: " + smallest);
    }

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at cell: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
    
    public static void printMat(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        //input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        printMat(matrix);

        // search(matrix, 13);

        minMax(matrix);
    }
}