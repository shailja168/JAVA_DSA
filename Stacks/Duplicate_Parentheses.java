package Stacks;

import java.util.*;

public class Duplicate_Parentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (s.peek() == '(') {
                    return true;
                } else {
                    while (s.peek() != '(') {
                        s.pop();
                    }
                }
                s.pop();
            }
            else {
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";
        System.out.println(isDuplicate(str));
    }
}
