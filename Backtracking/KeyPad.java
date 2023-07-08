package Backtracking;

public class KeyPad {

    public static void findCombinations(String digits, String ans, int i) {
        //base case
        if (i == digits.length()) {
            System.out.println(ans);
            return;
        }

        //recursion
        char curr = digits.charAt(i);
        switch (curr) {
            case '2':
                findCombinations(digits, ans + 'a', i + 1);
                findCombinations(digits, ans + 'b', i + 1);
                findCombinations(digits, ans + 'c', i + 1);
                break;
            case '3':
                findCombinations(digits, ans + 'd', i + 1);
                findCombinations(digits, ans + 'e', i + 1);
                findCombinations(digits, ans + 'f', i + 1);
                break;
            case '4':
                findCombinations(digits, ans + 'g', i + 1);
                findCombinations(digits, ans + 'h', i + 1);
                findCombinations(digits, ans + 'i', i + 1);
                break;
            case '5':
                findCombinations(digits, ans + 'j', i + 1);
                findCombinations(digits, ans + 'k', i + 1);
                findCombinations(digits, ans + 'l', i + 1);
                break;
            case '6':
                findCombinations(digits, ans + 'm', i + 1);
                findCombinations(digits, ans + 'n', i + 1);
                findCombinations(digits, ans + 'o', i + 1);
                break;
            case '7':
                findCombinations(digits, ans + 'p', i + 1);
                findCombinations(digits, ans + 'q', i + 1);
                findCombinations(digits, ans + 'r', i + 1);
                findCombinations(digits, ans + 's', i + 1);
                break;
            case '8':
                findCombinations(digits, ans + 't', i + 1);
                findCombinations(digits, ans + 'u', i + 1);
                findCombinations(digits, ans + 'v', i + 1);
                break;
            case '9':
                findCombinations(digits, ans + 'w', i + 1);
                findCombinations(digits, ans + 'x', i + 1);
                findCombinations(digits, ans + 'y', i + 1);
                findCombinations(digits, ans + 'z', i + 1);
                break;
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        findCombinations(digits, "", 0);
    }
}
