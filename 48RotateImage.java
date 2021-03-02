class Solution {
    public void rotate(int[][] matrix) {
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix.length - 1;
        
        while (top < bot && left < right) {
            for (int i = 0; i < right - left; i ++) {
                int topleft = matrix[top][left + i];
                int topright = matrix[top + i][right];
                int botleft = matrix[bot - i][left];
                int botright = matrix[bot][right - i];
                
                matrix[top][left + i] = botleft;
                matrix[top + i][right] = topleft;
                matrix[bot - i][left] = botright;
                matrix[bot][right - i] = topright;
            }
            left ++;
            right --;
            top ++;
            bot --;
        }
    }
}