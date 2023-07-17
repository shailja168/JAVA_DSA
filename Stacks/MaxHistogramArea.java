package Stacks;

import java.util.*;

public class MaxHistogramArea {

    public static int[] nextSmallerRight(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int[] nsr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length; // for right, store 'n' if no smaller value
            } else {
                nsr[i] = s.peek(); //storing the index
            }
            s.push(i);
        }
        return nsr;
    }

    public static int[] nextSmallerLeft(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int[] nsl = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek(); //storing the index
            }
            s.push(i);
        }
        return nsl;
    }

    public static int maxHistArea(int heights[]) {
        int nsl[] = nextSmallerLeft(heights);
        int nsr[] = nextSmallerRight(heights);

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int heights[] = { 1,1 };
        System.out.println("Max area in histogram = " + maxHistArea(heights));
    }
}
