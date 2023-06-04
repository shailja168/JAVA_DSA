package ARRAYS;

public class Subarray {

    public static void printSubarray(int num[]) {
        int totalS = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                totalS++;
                System.out.println();
            }
        }
        System.out.println("Total Subarrays= " + totalS);
    }

    //Prefix Array Approach
    public static void maxSubarraySum(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefixsum[] = new int[num.length];

        //calculate prefix array
        prefixsum[0] = num[0];
        for (int i = 1; i < prefixsum.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currsum = (i == 0) ? prefixsum[j] : prefixsum[j] - prefixsum[i - 1];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Subarray Sum = " + maxsum);
    }

    //Kadane's Algorithm 
    //If the current sum becomes negative, make it zero
    public static void Kadanes(int num[]) {
        
        //Modification
        //Check if the entire array has only negative numbers
        int totalNeg = 0, smallestNeg = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0)
                totalNeg++;
            smallestNeg = Math.max(smallestNeg, num[i]);
        }
        if (totalNeg == num.length) {
            System.out.println("Max Subarray Sum = " + smallestNeg);
            return;
        }
        
        //Actual algo
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currsum += num[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Max Subarray Sum = " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        
        // printSubarray(num);

        // maxSubarraySum(num);

        Kadanes(num);
    }
}
