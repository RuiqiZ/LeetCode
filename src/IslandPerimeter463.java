public class IslandPerimeter463 {

    public static void main(String[] args) {
        int[][] array = {{1,1}};
        System.out.print(islandPerimeter(array));
    }

    public static int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (1 == grid[i][j]) {
                    count += 4;
                    int neighbour = 0;
                    // validate
                    if (j - 1 >= 0) {
                        neighbour += grid[i][j-1];
                    }

                    if (j + 1 < grid[0].length) {
                        neighbour += grid[i][j+1];
                    }

                    if (i - 1 >= 0) {
                        neighbour += grid[i-1][j];
                    }

                    if (i + 1 < grid.length) {
                        neighbour += grid[i+1][j];
                    }

                    count -= neighbour;
                }
            }
        }
        return count;
    }
}
