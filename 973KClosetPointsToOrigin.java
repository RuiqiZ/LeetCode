class Solution {
    public int[][] kClosest(int[][] points, int K) {
        if (points.length == 1) {
            return points;
        }
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[0]*a[0] + a[1]*a[1], b[0]*b[0] + b[1]*b[1]));
        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i] = points[i];
        }
        return result;
    }
}