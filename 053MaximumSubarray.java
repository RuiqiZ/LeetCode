class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int max = Integer.MIN_VALUE;
        int currentSum = max;
        for (int num: nums) {
            if (currentSum < 0) {
                currentSum = num;
            } else {
                currentSum += num;
            }
            
            max = Math.max(currentSum, max);
        }
        
        return max;
    }
}