package Divide_And_Conquer;

public class Rotated_Array {

    public static int search(int arr[], int target, int si, int ei) {
        //base case
        if (si > ei) {
            return -1;
        }

        //kaam
        int mid = si + (ei - si) / 2;

        //case: FOUND
        if (arr[mid] == target) {
            return mid;
        }

        //mid on L1
        if (arr[si] <= arr[mid]) {
            //case A: left 
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            //case B: right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        //mid on L2
        else {
            //case C: right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            //case D: left 
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        //modified binary search
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
