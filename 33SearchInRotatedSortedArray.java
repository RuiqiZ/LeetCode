class Solution {
    public int search(int[] nums, int target) { //pivot is the smallest number
        
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        
        while (start < end) {
            middle = (start + end)/2;
            if (nums[middle] > nums[end]) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        
        if (nums[start] == target) return start;
        
        int pivot = start;
        if (target <= nums[nums.length-1]) {
            start = pivot + 1;
            end = nums.length - 1;
        } else {
            start = 0;
            end = pivot;
        }
         
        while (start <= end) {
            middle = (start + end)/2;
            if (nums[middle] == target) return middle;
            if (nums[middle] > target) end = middle - 1;
            else start = middle + 1;
        }
        
        return -1;
    }
}