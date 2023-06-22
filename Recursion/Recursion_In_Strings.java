package Recursion;

public class Recursion_In_Strings {

    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        //base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            //duplicate
            removeDuplicates(str, idx + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString.append(currChar), map);
        }
    }
    
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        //base case
        if (n == 0) {
            System.err.println(str);
            return;
        }
        //kaam
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // String str = "appna";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        printBinaryStrings(3, 0, "");
    }
}
