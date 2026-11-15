class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        int buy = Integer.MAX_VALUE;
        // int sell = 0;
        for (int i = 0; i < prices.length; i++) {
            // System.out.println("price i: " + prices[i]);
            // System.out.println("buy: " + buy);
            // System.out.println("sell: " + sell);
            if (prices[i] <= buy) {
                // System.out.println("buy here");
                buy = prices[i];
            } else {
                // System.out.println("sell here");
                // sell = prices[i];
                profit += prices[i] - buy;
                buy = prices[i];
                // System.out.println("profit: " + profit);
            }
        }
        return profit;
    }
}