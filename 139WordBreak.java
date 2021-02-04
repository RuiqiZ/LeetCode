class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       
        return isWord(s, wordDict, new HashMap<String, Boolean>());
    }
    
    public boolean isWord(String s, List<String> wordDict, HashMap<String, Boolean> map) {
        if (map.get(s) != null) return map.get(s);
        
        if (wordDict.contains(s)) {
            map.put(s, true);
            return true;
        }
        
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            
            if (wordDict.contains(right) && isWord(left, wordDict, map)) {
                map.put(right, true);
                return true;
            }            
        }
        
        map.put(s, false);
        return false;
    }
}