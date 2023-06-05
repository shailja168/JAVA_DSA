package ARRAYS;
import java.util.*;

public class Assignment {
    //Question 1
    public static boolean repeatTwice(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    //Question 2
    public static int binarySearch(int num[], int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if(num[mid] == target){
                return mid;
            }
            else if(num[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int searchIndex(int num[], int target) {
        //find index of the smallest value
        int minValIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < num[minValIndex])
                minValIndex = i;
        }

        //search in sorted left or right array
        if (target >= num[minValIndex] && target <= num[num.length - 1]) {
            return binarySearch(num, target, minValIndex, num.length - 1);
        } else {
            return binarySearch(num, target, 0, minValIndex);
        }
    }
    
    //Question 5
    public static List<List<Integer>> triplets(int num[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(num[i]);
                        triplet.add(num[j]);
                        triplet.add(num[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {
        // //Question 1
        // int num[] = { 1, 2, 3, 4, 5 };
        // if(repeatTwice(num))
        //     System.out.println("Value exist twice");
        // else {
        //         System.out.println("NO such value");
        //     }

        //Question 2
        // int num[] = { 5, 6, 7, 8, 0, 1, 2, 3, 4 };
        // int target = 10;
        // System.out.println("Target at index: " + searchIndex(num, target));

        //Question 5
        int num[] = { -1, 0, 1, 2, -1, -4 };
        //corner cases
        if (num.length < 3) {
            System.out.println("[ ]");
            return;
        } else if (num.length == 3) {
            if (num[0] + num[1] + num[2] == 0) {
                System.out.println("[" + num[0] + ", " + num[1] + ", " + num[2] + "]");
            } else {
                System.out.println("[ ]");
            }
            return;
        } else {
            //function call
            System.out.println(triplets(num));
        }
    }
}
