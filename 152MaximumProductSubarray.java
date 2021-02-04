class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length ==1) return nums[0];
        
        int current_max = nums[0];
        int current_min = nums[0];
        int max_so_far = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = current_max;
                current_max = current_min;
                current_min = temp;
            }
            
            current_max = Math.max(nums[i], current_max*nums[i]);
            current_min = Math.min(nums[i], current_min*nums[i]);
            
            max_so_far = Math.max(max_so_far, current_max);
        }
        
        return max_so_far;
    }
}