class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        if (time.length == 1) return 0;
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < time.length; i++) {
            if (time[i]%60 == 0 && map.containsKey(0)) {
                count += map.get(0);
            } else if (map.containsKey(60 - time[i]%60)) {
                count += map.get(60 - time[i]%60);
            } 
            map.put(time[i]%60, map.getOrDefault(time[i]%60, 0) + 1);
        }
        
        return count;
    }
}