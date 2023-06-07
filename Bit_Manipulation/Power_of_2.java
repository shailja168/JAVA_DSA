package Bit_Manipulation;

public class Power_of_2 {

    public static boolean isPowerOf2(int n) {
        return ((n & (n - 1)) == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOf2(32));
    }
}
