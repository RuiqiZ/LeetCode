class Solution {
    public String reorganizeString(String S) {
        String result = "";
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < S.length(); i ++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        
        if (map.size() == 1) return "";
        
        PriorityQueue<Character> q = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        q.addAll(map.keySet());
        
    
        while (!q.isEmpty()) {
            if (q.size() == 1) {
                if (map.get(q.peek()) > 1) return "";
                else {
                    result += q.poll();
                    return result;
                }
            }
            
            char curr = q.poll();
            char next = q.poll();
            result += curr + "" + next;
            map.put(curr, map.get(curr) - 1);
            map.put(next, map.get(next) - 1);
            
            if (map.get(curr) > 0) {
                q.add(curr);
            }
            
            if (map.get(next) > 0) {
                q.add(next);
            }
            
        }
        
        return result;
    }
}