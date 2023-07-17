package Stacks;

import java.util.*;

public class Assignment {
    //Question 1
    public static boolean isPanlindrome(Node head) {
        Stack<Integer> s = new Stack<>();
        Node ptr = head;
        while (ptr != null) {
            s.push(ptr.data);
            ptr = ptr.next;
        }

        while (head != null && head.data == s.pop()) {
            head = head.next;
        }

        if (head == null) {
            return true;
        }
        return false;
    }
    
    //Question 2
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] directories = path.split("/");

        for (String dir : directories) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            } else if (dir.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(dir);
            }
        }
        return "/" + String.join("/", s);
    }
    
    //Question 3
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
            } else if (ch == '[') {
                strStack.push(result);
                result = new StringBuilder();
                numStack.push(num);
                num = 0;
            } else if (ch == ']') {
                StringBuilder temp = result;
                result = strStack.pop();
                int count = numStack.pop();
                while (count-- > 0) {
                    result.append(temp);
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    //Question 4
    public static int trappingRainwater(int height[]) {
        Stack<Integer> s = new Stack<>();
        int trappedWater = 0;

        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] < height[i]) {
                int popHeight = height[s.pop()];
                if (s.isEmpty()) {
                    break;
                }
                int dist = i - s.peek() - 1;
                int minHeight = Math.min(height[s.peek()], height[i]) - popHeight;
                trappedWater += dist * minHeight;
            }
            s.push(i);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        //Question 1
        // Node one = new Node(1);
        // Node two = new Node(2);
        // Node three = new Node(3);
        // Node four = new Node(2);
        // Node five = new Node(1);
        // one.next = two;
        // two.next = three;
        // three.next = four;
        // four.next = five;

        // if (isPanlindrome(one)) {
        //     System.out.println("LL is a Palindrome");
        // } else {
        //     System.out.println("LL is not a Palindrome");
        // }

        //Question 2
        // String path = "/a//b////c/d//././/..";
        // String path2 = "/a/../../b/../c//.//";
        // String path3 = "/../";
        // System.out.println(simplifyPath(path));

        //Question 3
        // String s = "3[a2[c]]";
        // System.out.println(decodeString(s));

        //Question 4
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped Rainwater = " + trappingRainwater(height));
    }
}

class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}