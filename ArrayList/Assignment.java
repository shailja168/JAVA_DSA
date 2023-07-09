package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment {

    //Question 1
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                inc = false;
            }
            if (nums.get(i) < nums.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }
    
    //Question 2
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> nums) {
        ArrayList<Integer> sol = new ArrayList<>();
        //only one element
        if (nums.size() == 1) {
            sol.add(nums.get(0));
            return sol;
        }

        Collections.sort(nums);

        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && (nums.get(i) + 1) < nums.get(i + 1)) {
                sol.add(nums.get(i));
            }
        }
        //for first element
        if (nums.get(0) + 1 < nums.get(1)) {
            sol.add(nums.get(0));
        }
        //for last element
        if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            sol.add(nums.get(nums.size() - 1));
        }

        return sol;
    }
    
    //Question 3
    public static int mostFreq(ArrayList<Integer> nums, int key) {
        int result[] = new int[1000];

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i] > maxFreq) {
                maxFreq = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }
    
    //Question 4
    public static ArrayList<Integer> beautifulArray(int n) {

        //Approach 1
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(1);
        // for (int i = 2; i < n; i++) {
        //     ArrayList<Integer> temp = new ArrayList<>();
        //     for (Integer e : ans) {
        //         if (2 * e <= n)
        //             temp.add(2 * e);
        //     }
        //     for (Integer e : ans) {
        //         if (2 * e - 1 <= n)
        //             temp.add(2 * e - 1);
        //     }
        //     ans = temp;
        // }
        // return ans;

        //Approach 2
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }

    public static void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2 * increment, res, n);
        divideConquer(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(3);

        // System.out.println(isMonotonic(list));

        // System.out.println(lonelyNum(list));

        // System.out.println(mostFreq(list, 1));

        System.out.println(beautifulArray(5));


    }
}
