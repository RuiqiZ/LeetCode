class Solution {
    public int fib(int n) {
        int[] m = new int[n + 1];
        return fibonacci(m, n, 0);
    }
    
    public int fibonacci(int[] memory, int n, int result) {
        if (n == 0) {
            memory[0] = 0;
            return 0;
        } else if (n == 1) {
            memory[1] = 1;
            return 1;
        } else {
            result = (memory[n-1] == 0 ? fibonacci(memory, n-1, result) : memory[n-1]) + (memory[n-2] == 0? fibonacci(memory, n-2, result) : memory[n-2]);
            memory[n] = result;
            
        }
        
        return result;
    }
}