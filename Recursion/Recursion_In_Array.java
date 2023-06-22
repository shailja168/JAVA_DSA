package Recursion;

public class Recursion_In_Array {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurrence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, i + 1, key);
    }

    public static int lastOccurrence(int arr[], int i, int key, int found) {
        if (i == arr.length) {
            return found;
        }
        if (arr[i] == key) {
            found = i;
        }
        return lastOccurrence(arr, i + 1, key, found);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 9, 5, 6 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurrence(arr, 0, 5));
        System.out.println(lastOccurrence(arr, 0, 5, -1));
    }
}
