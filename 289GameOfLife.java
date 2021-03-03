class Solution {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                int live = live(board, i, j + 1) + live(board, i, j - 1) + live(board, i-1, j - 1)
                    + live(board, i-1, j + 1) + live(board, i-1, j) + live(board, i+1, j - 1) +
                    live(board, i+1, j) + live(board, i+1, j+1);
                
                if (board[i][j]%10 == 0 && live == 3) {
                    board[i][j] = 10;
                } else if (board[i][j]%10 == 1 && (live == 2 || live == 3)) { 
                    board[i][j] = 11;
                }
            }
        }
        
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                board[i][j] = board[i][j]/10;
            }
        }       
    }
    
    public int live(int[][] board, int i, int j) {
        if (i < 0 || j <0 || i>= board.length || j >= board[i].length) {
            return 0;
        } else {
            return board[i][j]%10;
        }
    }
}