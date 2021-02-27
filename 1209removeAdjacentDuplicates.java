class Solution {
    public String removeDuplicates(String s, int k) { //using stack
        Stack<Integer> stack = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i-1)) {
                int freq = stack.pop();
                stack.push(freq+1);
            } else {
                stack.push(1);
            }
            
            if (stack.peek() == k) {
                stack.pop();
                s = s.substring(0, i - k + 1) + s.substring(i+1);
                i -= k;
            }
                
        }
        return s;
    }
}