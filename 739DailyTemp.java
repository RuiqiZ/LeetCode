class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Stack<Data> stack = new Stack();
        
        for (int i = T.length - 1; i >= 0; i --) {
            while (!stack.isEmpty() && stack.peek().temp <= T[i]) {
                stack.pop();
            }       
            
            if (!stack.isEmpty()) result[i] = stack.peek().day - i;
            stack.push(new Data(T[i], i));
            
        }
        return result;
    }
}

class Data{
    int temp;
    int day;
    
    Data(int temp, int day) {
        this.temp = temp;
        this.day = day;
    }
}