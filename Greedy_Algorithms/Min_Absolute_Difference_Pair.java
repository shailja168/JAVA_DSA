import java.util.*;

public class Min_Absolute_Difference_Pair{
    public static void main(String[] args) {   //O(nlogn)
        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 6, 3, 5 };

        Arrays.sort(a);
        Arrays.sort(b);
        
        int minDiff = 0;

        // System.out.print("Pairs: ");
        for (int i = 0; i < b.length; i++) {
            // System.out.print("(" + a[i] + "," + b[i] + ") ");
            minDiff += Math.abs(a[i] - b[i]);
        }

        System.out.println("\nMin Absolute Difference = " + minDiff);
    }
}