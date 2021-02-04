class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < length; i ++) {
            int odd = palindromeSize(s, i, i);
            int even = palindromeSize(s, i, i+1);
            
            int max = Math.max(odd, even);
            if (max > end - start) {
                start = i - (max-1)/2;
                end = i + (max/2);
            }
        }
        
        return s.substring(start, end+1);
    }
    
    public int palindromeSize(String s, int left, int right) {
        if (right < left || s == null) return 0;
    
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;      
        }
        
        return right - left -1;
    }
}