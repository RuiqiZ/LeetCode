class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = dp.length-1; i >= 0; i --) {
            for (int j = dp[i].length -1; j >= 0; j--) {
                
                if (i + 1 < dp.length && j + 1 < dp[i].length) {
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + grid[i][j];
                } else if (i + 1 < dp.length) {
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                } else if (j + 1 < dp[i].length) {
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                } else {
                    dp[i][j] = grid[i][j];
                }
            }
        } 
        
        return dp[0][0];
    }
}