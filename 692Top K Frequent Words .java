class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList();
        HashMap<String, Integer> map = new HashMap();
        
        for (String s: words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        PriorityQueue<String> q = new PriorityQueue<>(
            (a, b) -> map.get(b).equals(map.get(a)) ? a.compareTo(b): map.get(b) - map.get(a)
        );
        q.addAll(map.keySet());
        
        int count;
        
        while (!q.isEmpty() && k > 0) {
            result.add(q.poll());
            k--;
        }
        return result;
    }
}