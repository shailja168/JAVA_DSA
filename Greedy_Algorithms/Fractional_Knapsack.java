import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {//O(nlogn)
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        //ratio is in ascending order, so we iterate from back Since we need it in descending order
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                //include full itme
                finalVal += val[idx];
                capacity -= weight[idx];
            }
            else {
                //include fractinal item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final val= " + finalVal);
    }
}
