package ARRAYS;

public class Reverse {
    public static void main(String[] args) {
        int a[] = { 12, 43, 5, 3, 78, 6};
        int n = a.length;

        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
