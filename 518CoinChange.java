class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j ++) {
                if (j == 0) dp[i][j] = 1;
                else if (j >= coins[i-1]) dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];//include + exclude
                else if (j < coins[i-1]) dp[i][j] = dp[i-1][j];
            }
        }
        
        return dp[coins.length][amount];
    }
}