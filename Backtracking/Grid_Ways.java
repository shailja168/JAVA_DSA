package Backtracking;

public class Grid_Ways {

    //Time Complexity: O( 2^(n+m) )
    public static int gridWays(int x, int y, int n, int m) {
        //base case
        if (x == n - 1 && y == m - 1) { //condition for last cell
            return 1;
        } else if (x == n || y == m) { //boundary cross condition
            return 0;
        }

        return gridWays(x + 1, y, n, m) + gridWays(x, y + 1, n, m);
    }

    //Time Complexity: O(n+m)
    public static int gridWaysOptimized(int n, int m) {
        return fact(n - 1 + m - 1) / (fact(n - 1) * fact(m - 1));
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(gridWaysOptimized(n, m));
    }
}
