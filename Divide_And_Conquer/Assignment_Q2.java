package Divide_And_Conquer;

public class Assignment_Q2 {

    public static int majorityElement(int nums[], int si, int ei) {
        if (si == ei) {
            return nums[si];
        }

        int mid = si + (ei - si) / 2;
        int left = majorityElement(nums, si, mid);
        int right = majorityElement(nums, mid + 1, ei);

        //if both halves agree on the majority element
        if (left == right) {
            return left;
        }

        //else count each element and find the winner   
        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int countInRange(int nums[], int key, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums, 0, nums.length - 1));
    }
}
