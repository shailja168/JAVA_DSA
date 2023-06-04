package ARRAYS;

public class Pairs {
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12 };
        int totalPairs = 0;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + totalPairs);
    }
}
