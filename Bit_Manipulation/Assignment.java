package Bit_Manipulation;

public class Assignment {

    //Question 1
    public static void swap(int a, int b) {
        System.out.println("before swapping: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swapping: a = " + a + " b = " + b);
    }

    //Question 2
    public static int addOne(int n) {
        int bitmask = 1;
        // Flip all the set bits until we find a 0
        while ((n & bitmask) == 1) {
            n = n ^ bitmask;
            bitmask <<= 1;
        }
        // flip the rightmost 0 bit
        n = n ^ bitmask;
        return n;

        // Using NOT Operator: 
        // We know, -x = ~x + 1
        // So, -~x = x + 1

        // return -(~n);
    }

    //Question 3
    public static void upperToLower() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
        // prints abcdefghijklmnopqrstuvwxyz
    }

    public static void main(String[] args) {
        //Question 1
        // int a = 5, b = 7;
        // swap(a, b);

        //Question 2
        // System.out.println(addOne(4));

        //Question 3
        upperToLower();
    }
}
