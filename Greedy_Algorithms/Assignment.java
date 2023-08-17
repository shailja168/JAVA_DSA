public class Assignment {

    //Question 1
    public static int balancedString(String s) {
        int l = 0, r = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                ans++;
            }
        }
        return ans;
    }
    
    //Question 2
    public static int kthLargestOddNum(int l, int r, int k) {
        if (k <= 0) {
            return 0;
        }

        if ((r & 1) > 0) { //r is odd
            int count = (int) Math.ceil((r - l + 1) / 2); //total odd no.s
            if (k > count) {
                return 0;
            } else {
                return (r - 2 * k + 2);
            }
        } else {
            int count = (r - l + 1) / 2; //total odd no.s
            if (k > count) {
                return 0;
            } else {
                return (r - 2 * k + 1);
            }
        }
    }
    
    //Question 3
    public static StringBuilder lexoSmall(int n, int k) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append('a');
        }
        int value = k - n;
        int end = n - 1;
        while (value != 0) {
            if (value >= 25) {
                ans.replace(end, end + 1, "z");
                value -= 25;
            } else {
                Character temp = (char) (value + 97);
                ans.replace(end, end + 1, temp.toString());
                value = 0;
            }
            end--;
        }
        return ans;
    }
    
    //Question 4
    public static int buySellStocks(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    //Question 5

    static boolean check(int mid, int arr[], int n, int k) {
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mid) {
                return false;
            }
            sum += arr[i];

            if (sum > mid) {
                count++;
                sum = arr[i];
            }
        }
        count++;

        if (count <= k) {
            return true;
        }
        return false;
    }
    public static int subarraySum(int arr[], int n, int k) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > start) {
                start = arr[i];
            }
        }
        int end = 0;
        
        for (int i = 0; i < n; i++) {
            end += arr[i];
        }

        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (check(mid, arr, n, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //Question 1
        // String s = "LRRRRLLRLLRL";
        // System.out.println(balancedString(s));

        //Question 2
        // System.out.println(kthLargestOddNum(-10, 10, 8));

        //Question 3
        // System.out.println(lexoSmall(5, 42));

        //Question 4
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(buySellStocks(prices));

        //Question 5
        int arr[] = { 1, 2, 3, 4 };
        int k = 3;
        System.out.println(subarraySum(arr, arr.length, k));
        
    }
}
