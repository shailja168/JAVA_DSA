package Divide_And_Conquer;

public class Merge_Sort {

    public static void mergeSort(int arr[], int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }
        //kaam
        int mid = si + (ei - si) / 2; //(si+ei)/2
        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid + 1, ei); //right
        merge(arr, si, mid, ei);
    }
    
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int l = si; //iterator for left part
        int r = mid + 1; //iterator for right part
        int k = 0; //iterator for temp

        while (l <= mid && r <= ei) {
            if (arr[l] < arr[r]) {
                temp[k] = arr[l];
                l++;
            } else {
                temp[k] = arr[r];
                r++;
            }
            k++;
        }

        //left part
        while (l <= mid) {
            temp[k++] = arr[l++];
        }

        //right part
        while (r <= ei) {
            temp[k++] = arr[r++];
        }

        //copy temp to original
        for (k = 0, l = si; k < temp.length; k++, l++) {
            arr[l] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 2, 6, 1, 2, 9, -1 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
