package Recursion;

public class Power {

    //Time Complexity: O(n)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * calcPower(x, n - 1);
    }
    
    //Time Complexity: O(logn)
    public static int calcPowerOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = calcPowerOptimized(x, n / 2);
        //n is odd
        if (n % 2 != 0) {
            return x * halfPower * halfPower;
        }            
        return halfPower * halfPower; 
    }
    public static void main(String[] args) {
        System.out.println(calcPower(2, 10));
        System.out.println(calcPowerOptimized(2, 10));
    }
}
