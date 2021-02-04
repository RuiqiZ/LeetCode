class Solution {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int water = 0;
        int length = height.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int level = height[0];
        
        for (int i = 0; i < length; i++) {
            if (height[i] > level) {
                level = height[i];
            }
            
            left[i] = level;
        }
        
        level = height[length - 1];
        
        for (int i = length-1; i >= 0; i--) {
            if (height[i] > level) {
                level = height[i];
            }
                
                
            right[i] = level;
        }
        
        for (int i = 0; i < length; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }
        
        return water;
    }
}