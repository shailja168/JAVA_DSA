package Backtracking;

public class Subsets {
     // Time Complexity: O(n * 2^n)
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, ans + str.charAt(i), i + 1); //yes
        findSubsets(str, ans, i + 1); //no
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
