class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j ++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                } else {
                    dp[i][j] = 0;
                }
                
                if(dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        
        return max*max;
    }
}