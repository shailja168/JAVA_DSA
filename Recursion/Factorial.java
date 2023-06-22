package Recursion;

public class Factorial {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumN(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(fact(n));
        System.out.println(sumN(n));
    }
}
