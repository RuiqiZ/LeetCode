class Solution {
    public int minSwaps(int[] data) {
        int ones = 0;
        for (int d: data) {
            ones += d;
        }
        
        if (ones == 1) {
            return 0;
        }
        
        int onesInWindow = 0;
        for (int i = 0; i < ones; i ++) {
            onesInWindow += data[i];
        }
        
        int maxOnes = onesInWindow;
        
        for (int i = ones; i < data.length; i ++) {
            onesInWindow += data[i] - data[i - ones];
            maxOnes = Math.max(maxOnes, onesInWindow);
        }
        return ones - maxOnes;
    }
}