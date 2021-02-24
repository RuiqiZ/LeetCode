class Solution {
    public boolean exist(char[][] board, String word) {
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j ++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0, new boolean[board.length][board[0].length])){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int pos, boolean[][] visited) {
        if (pos == word.length()) return true;
        if (i < 0 || j<0 || i>=board.length || j >=board[i].length ||board[i][j] != word.charAt(pos) ||
           visited[i][j]) return false;
        
        visited[i][j] = true;
        
        if (dfs(board, word, i+1, j, pos+1, visited)) return true;
        if (dfs(board, word, i-1, j, pos+1, visited)) return true;
        if (dfs(board, word, i, j + 1, pos+1, visited)) return true;
        if (dfs(board, word, i, j - 1, pos+1, visited)) return true;
        
        visited[i][j] = false;
        
        return false;
    }
}