class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int k = 0;
        int i = 0;
        int j = 0;
        
        while ( k < m+n) {
            if (i == m) {
                result[k] = nums2[j];
                j++;
            } else if (j == n) {
                result[k] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        for (int t = 0; t < m+n; t++) {
            nums1[t] = result[t];
        }
    }
}

