package Recursion;

public class Assignment {

    //Question 1
    public static void allOccurrences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurrences(arr, key, i + 1);
    }
    
    //Question 2
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int num) {
        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;
        printDigits(num / 10);
        System.out.print(digits[lastDigit] + " ");
    }
    
    //Question 3
    public static int lengthOfString(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return lengthOfString(str.substring(1)) + 1;
    }

    //Question 4
    public static int countSubstr(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int result = countSubstr(str, i + 1, j, n - 1) +
                countSubstr(str, i, j - 1, n - 1) -
                countSubstr(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            result++;
        }
        return result;
    }
    
    //Question 5
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        //Question 1
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2};
        // allOccurrences(arr, 2, 0);

        //Question 2
        // printDigits(2023);

        //Question 3
        // System.out.println(lengthOfString("HowAreYou"));

        //Question 4
        // String str = "abcab";
        // int n = str.length();
        // System.out.println(countSubstr(str, 0, n - 1, n));

        //Question 5
        int n = 2;
        towerOfHanoi(n, "A", "B", "C");
        
    }
}
