class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        int sum = 0;
        
        for (int num: nums) {
            sum += num;
            
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            
        }
        return result;
    }
}