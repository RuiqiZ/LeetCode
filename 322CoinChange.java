class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[][] dp = new int[coins.length + 1][amount + 1];
        Arrays.fill(dp[0], Integer.MAX_VALUE);
        Arrays.sort(coins);
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = 0;
                } else if (coins[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    int include = dp[i][j-coins[i-1]] == Integer.MAX_VALUE ? Integer.MAX_VALUE: 1+dp[i][j-coins[i-1]];
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.min(include, exclude);
                }
            }
        }
        
        
        return (dp[coins.length][amount] == Integer.MAX_VALUE? -1: dp[coins.length][amount]);
    }
    
}