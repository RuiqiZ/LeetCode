class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        int row = matrix.length;
        int col = matrix[0].length;
        go(matrix, 0, 0, row, col, result);
        return result;
    }
    
    
    public void go(int[][] matrix, int i, int j, int row, int col, List<Integer> result) {
        if (i >= row || j >= col || i < 0 || j < 0 || matrix[i][j] == 200) return;
        
        result.add(matrix[i][j]);
        matrix[i][j] = 200;
        
        if (i == 0 || matrix[i-1][j] == 200) //go right if can't go up
            go(matrix, i, j+1, row, col, result);
        
        if (j == col - 1 || matrix[i][j+1] == 200) //go down if can't go right
            go(matrix, i+1, j, row, col, result);
        
        if (i == row - 1 || matrix[i + 1][j] == 200) // go left if can't go down
            go(matrix, i, j-1, row, col, result);
        
        if (j == 0 || matrix[i][j-1] == 200) //go up if can't go left
            go(matrix, i - 1, j, row, col, result);
    }
    
}