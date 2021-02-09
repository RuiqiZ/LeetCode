class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String w:words) {
           map.put(w, 1);
        }
        
        int max = 1;
        for (String w:words) {
            if (w.length() > 1) {
                for (int i = 0; i < w.length(); i++) {
                    StringBuilder sb = new StringBuilder(w);
                    String pre = sb.deleteCharAt(i).toString();
                    if (map.containsKey(pre)) {
                        map.put(w, Math.max(map.get(w), map.get(pre) + 1));
                        max = Math.max(max, map.get(w));
                    }
                }
            }    
        }
        return max;
    }
}