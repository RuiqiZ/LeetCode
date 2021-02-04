class Solution {
    public int countSubstrings(String s) {
        if (s == null) return 0;
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += count(s, i-1,i);
            result += count(s, i,i);
        }
        return result;
    }
    
    public int count(String s, int start, int end) {
        int result = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            result ++;
            start --;
            end ++;
        }
        return result;
    }
}