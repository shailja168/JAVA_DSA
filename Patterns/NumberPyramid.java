package Patterns;
import java.util.Scanner;

public class NumberPyramid {

    public static void sameNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    public static void palindromeNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //ascending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //descending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // sameNumberPyramid(n);
        palindromeNumberPyramid(n);
    }
}
