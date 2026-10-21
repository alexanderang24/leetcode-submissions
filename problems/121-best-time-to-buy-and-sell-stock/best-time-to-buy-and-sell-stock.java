class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // System.out.println("price is now: " + price);
            if (price < lowest) {
                lowest = price;
                // System.out.println("lowest is now: " + lowest);
            } else {
                int profit = price - lowest;
                // System.out.println("profit is now: " + profit);
                if (profit > maxProfit) {
                    // System.out.println("maxProfit is now: " + maxProfit);
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}