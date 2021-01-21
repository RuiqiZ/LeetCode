class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = -1;
        int maxProfit = 0;
    
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = -1;
            }
            
            if (prices[i] > sell) {
                sell = prices[i];
                
                if (sell - buy > maxProfit) {
                    maxProfit = sell - buy;
                }
            }
            
        }
        return maxProfit;
    }
}