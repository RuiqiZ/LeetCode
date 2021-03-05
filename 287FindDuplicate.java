class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap();
        
        for (int num: nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
            if (m.get(num) > 1) {
                return num;
            }
        }
        return -1;
    }
}