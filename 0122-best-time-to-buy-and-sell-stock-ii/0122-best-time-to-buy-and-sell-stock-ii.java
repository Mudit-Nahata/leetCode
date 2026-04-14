class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; int first = prices[0]; int total = 0;
        for(int i = 1; i < prices.length; i++){
            if(profit > prices[i]- first) {
                first = prices[i];
            } else {
                profit = prices[i] - first;
                total = total + profit;
                first = prices[i];
                profit = 0;
            }
            
        }
        return total;
    }
}