package Recursion;

public class Pairs {

    public static int pairingProblem(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        //kaam: choice
        // int singleWays = pairingProblem(n - 1);
        // int pairWays = (n - 1) * pairingProblem(n - 2);

        return pairingProblem(n - 1) + (n - 1) * pairingProblem(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(pairingProblem(3));
    }
}
