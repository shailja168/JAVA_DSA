package ARRAYS;

public class Stocks {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            buyPrice = Math.min(prices[i], buyPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = { 7, 11, 5, 3, 6, 14 };
        // int prices[] = { 7, 6, 5, 4, 3, 2 };

        System.out.println("Max Profit = " + buyAndSellStocks(prices));
        
    }
}
