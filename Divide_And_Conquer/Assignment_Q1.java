package Divide_And_Conquer;

public class Assignment_Q1 {
    public static String[] mergeSort(String arr[], int lo, int hi) {
        //base case
        if (lo == hi) {
            String A[] = { arr[lo] };
            return A;
        }
        //kaam
        int mid = lo + (hi - lo) / 2; 
        String[] arr1 = mergeSort(arr, lo, mid); 
        String[] arr2 = mergeSort(arr, mid + 1, hi); 
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }
    
    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];
        int idx = 0;
        
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }
        while (i < m) {
            arr3[idx++] = arr1[i++];
        }
        while (j < n) {
            arr3[idx++] = arr2[j++];
        }
        return arr3;
    }

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        printArr(mergeSort(arr, 0, arr.length - 1));
    }
}
