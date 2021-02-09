class Solution {
    public int minCost(int[][] costs) {
        if (costs.length == 0) return 0;
        if (costs.length == 1) return Math.min(Math.min(costs[0][0], costs[0][1]), costs[0][2]);
        for (int i = costs.length - 2; i >= 0; i--) {
            for (int j = 0; j < costs[i].length; j ++) {
                
                if (j == 0) {
                    costs[i][j] += Math.min(costs[i + 1][1], costs[i+1][2]);
                } else if (j == 1) {
                    costs[i][j]+= Math.min(costs[i+1][0], costs[i+1][2]);
                } else if (j == 2) {
                    costs[i][j] += Math.min(costs[i+1][0], costs[i+1][1]);
                }
                
            }
        }
        
        return Math.min(Math.min(costs[0][0], costs[0][1]), costs[0][2]);
    }
}