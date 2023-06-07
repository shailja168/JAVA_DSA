package Bit_Manipulation;

public class Fast_Exponential {

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) == 1) { //check LSB
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
    }
}
