package Recursion;

public class Fibonacci {

    public static int fib(int n) { //Time Complexity: O(2^n)
        if(n == 0 || n == 1){
            return n;
        }     
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 5; //0 1 1 2 3 5 8 ....
        System.out.println(fib(n));
    }
}
