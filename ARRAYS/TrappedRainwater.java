package ARRAYS;

public class TrappedRainwater {

    //Auxilliary Arrays are used
    public static int trappingRainwater(int height[]) {
        int n = height.length;

        //calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        //calculate right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedwater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //waterlevel = min(leftMax bound, rightMax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trappedwater += waterlevel - height[i]
            trappedwater += (waterlevel - height[i]);
        }
        
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped Rainwater = " + trappingRainwater(height));
    }
}
