package Stacks;

import java.util.*;

public class Next_Greater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        // int arr[] = { 4, 2, 12, 6, 9, 3, 0, 1 };

        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            //1 while
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                s.pop();
            }

            //2 if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            //3 push in s
            s.push(i);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
