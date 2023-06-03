package ARRAYS;

public class Search {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key)
                return i;
        }
        return -1;
    }
    
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
        }
        return largest;
    }
    
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            else if (numbers[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int numbers[] = { 1, 12, 43, 56, 7, 10, 6 };
        // int key = 1;
        // int index = linearSearch(numbers, key);
        // if (index == -1)
        //     System.out.println("NOT FOUND");
        // else
        //     System.out.println("key is at: " + index);


        // int numbers[] = { 23, 145, 67, 89, 99, 45, 23, 12 };
        // System.out.println("largest number is: " + getLargest(numbers));


        int numbers[] = { 2, 4, 6, 8, 12, 14, 16, 17, 20 };
        int key = 22;
        int index = binarySearch(numbers, key);
        if (index == -1)
            System.out.println("NOT FOUND");
        else
            System.out.println("key is at: " + index);

    }
}