class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        int maxStart = 0;
        int maxEnd = 0;
        
        while (start != end || start < end) {
            int area = 0;
            if (height[start] < height[end]) {
                area = height[start] * (end-start);
                
                if (area > maxArea) {
                    maxArea = area;
                    maxStart = start;
                    maxEnd = end;
                }
                start++;
            } else {
                area = height[end] * (end-start);
                if (area > maxArea) {
                    maxArea = area;
                    maxStart = start;
                    maxEnd = end;
                }
                end--;
            }
        }
        
        return (maxEnd - maxStart)*(height[maxStart] > height[maxEnd] ? height[maxEnd] : height[maxStart]);
        
    }
}