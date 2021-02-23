class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        
        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j ++) {
                if (grid[i][j] == 1) {
                    int count = dfs(grid, i, j);
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
    
    public int dfs(int[][] grid, int row, int col) {
        if (row >= grid.length || row <0 || col >= grid[row].length || col < 0 || grid[row][col] == 0) return 0;

        grid[row][col] = 0;
        return 1 + dfs(grid, row-1, col) + dfs(grid, row+1, col) + dfs(grid, row, col-1) + dfs(grid, row, col+1);
    }
}