package Bit_Manipulation;

public class BitManipulaton_Basics {

    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 1) {
            return setIthBit(n, i);
        } else {
            return clearIthBit(n, i);
        }
    }
    
    public static int clearIBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = (~0) << (j + 1);     
        // int b = ~((~0) << i);    
        int b = (1 << i) - 1;    
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        // int n = 15, i = 2;
        // System.out.println("bit at position " + i + " is: " + getIthBit(n, i));
        // System.out.println(setIthBit(n, i));
        // System.out.println(clearIthBit(n, i));
        // System.out.println(updateIthBit(n, i, 1));
        // System.out.println(clearIBits(n, i));
        System.out.println(clearRangeBits(10,2,4));
    }
}
