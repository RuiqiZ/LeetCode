/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int left = dimensions.get(1);
        
        for (int i = 0; i < dimensions.get(0); i++) {
            // binary search on each row
            int start = 0;
            int end = dimensions.get(1) -1;
            while (start < end) {
                int mid = (start + end)/2;
                if (binaryMatrix.get(i, mid) == 0) start = mid + 1;
                else end = mid;
            }
            if (binaryMatrix.get(i, end) == 1) left = Math.min(left, end);
        }
        
        if (left == dimensions.get(1)) return -1;
        return left;
    }
}