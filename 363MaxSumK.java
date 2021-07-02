class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;        
        int cols = matrix[0].length;
        
        if (rows == 1 && cols == 1) {
            return matrix[0][0];
        }
        
        if (rows == 1) {
            return maxSumSubArray(matrix[0], k);
        }
        
        int max = Integer.MIN_VALUE;

        for (int colLeft = 0; colLeft < cols - 1; colLeft++) {
            int[] temp = new int[rows];
            
            for (int colRight = colLeft; colRight < cols; colRight++) {
                
                for (int row = 0; row < rows; row++) {
                    if (colRight == colLeft) {
                        temp[row] = matrix[row][colRight];
                    } else {
                        temp[row] += matrix[row][colRight];
                    }
                }
                
                // find the max sum sub array in temp
                max = Math.max(max, maxSumSubArray(temp, k));
            }
            
        }
        return max;
    }
    
    public int maxSumSubArray(int[] arr, int k) {
        TreeSet<Integer> tree = new TreeSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        tree.add(0);
        for (int num: arr) {
            sum += num;
            Integer ceiling = tree.ceiling(sum - k);
            if (ceiling != null) {
                max = Math.max(max, sum - ceiling);
            }
            tree.add(sum);
        }
        return max;
    }
}