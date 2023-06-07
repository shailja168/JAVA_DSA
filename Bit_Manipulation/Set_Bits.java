package Bit_Manipulation;

public class Set_Bits {

    public static int countSetBits(int n) { //O(logn)
        int count = 0;
        while (n > 0) {
            // int lsb = (n & 1);
            if ((n & 1) == 1) { // check lsb
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(16));
    }
}
