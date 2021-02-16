class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, n);
        
        for (int i = 0; i <= n; i++) {
            if (i == 0) dp[i] = 0;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j*j]);
            }
        }
        
        return dp[n];
    }
}