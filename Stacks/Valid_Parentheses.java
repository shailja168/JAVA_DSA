package Stacks;

import java.util.*;

public class Valid_Parentheses {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                    || (s.peek() == '{' && ch == '}') 
                    || (s.peek() == '[' && ch == ']')) {
                        s.pop();
                } 
                else {
                    return false;
                }
            }
        }
        if (!s.isEmpty()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "{()[]()}"; //true
        // String str2 = "((("; //false
        System.out.println(isValid(str));
    }
}
