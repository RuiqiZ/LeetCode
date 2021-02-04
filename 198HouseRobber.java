class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int length = nums.length;
        int[] dp = new int[length];
        
        for (int i = 0; i < length; i++) {
            if (i == 0) dp[i] = nums[0];
            if (i == 1) dp[i] = Math.max(nums[0], nums[1]);
            
            if (i > 1) {
                dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
            }
        }
        return dp[length-1];
    }
}