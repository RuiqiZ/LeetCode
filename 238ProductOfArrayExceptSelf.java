class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        List<Integer> poszeros = new ArrayList<>();
        int product = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                poszeros.add(i);
            } else {
                product*=nums[i];
            }
        }
        
        if (poszeros.size() >= 2) return result;
        
        for (int i = 0; i < nums.length; i ++) {
            if (poszeros.size() == 1) {
                if (i != poszeros.get(0)) {
                    result[i] = 0;
                } else {
                    result[i] = product;
                }
            } else {
                result[i] = product/nums[i];
            }
            
        }
        
        return result;
    }
}