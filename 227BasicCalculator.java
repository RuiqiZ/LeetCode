class Solution {
    public int calculate(String s) {
        s = s.trim();
        Stack<Integer> stack = new Stack();
        String num = "";
        char operator = ' ';
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num += c;
            } 
            
            if ((c < '0' || c > '9') && c != ' ' || i+1 == s.length()) { // operators
                
                if (operator == '-') {
                    stack.push((-1)*Integer.valueOf(num));
                } else if (operator == '/') {
                    stack.push(stack.pop()/Integer.valueOf(num));
                } else if (operator == '*') {
                    stack.push(stack.pop()*Integer.valueOf(num));
                } else {
                    stack.push(Integer.valueOf(num));
                }
                
                num = "";
                operator = c;
            }
        }
        
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}