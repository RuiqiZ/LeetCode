class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum = 0;
        int leftIndex = 0;
        int rightsum = 0;
        int rightIndex = cardPoints.length - k;
        
        for (int i = cardPoints.length - k; i <cardPoints.length; i++) {
            rightsum += cardPoints[i];
        }
        int sum = rightsum;
        
        while (k > 0) {
            leftsum += cardPoints[leftIndex];
            rightsum -=cardPoints[rightIndex];
            sum = Math.max(sum, leftsum + rightsum);
            leftIndex++;
            rightIndex++;
            k--;
        }
        
        return sum;
    }
}