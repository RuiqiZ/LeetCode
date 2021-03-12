class BrowserHistory {
    private String homepage;
    private Stack<String> stack;
    int pos;
    public BrowserHistory(String homepage) {
        this.homepage = homepage;
        stack = new Stack();
        stack.push(homepage);
        pos = stack.size() - 1 ;
    }
    
    public void visit(String url) {  
        while (stack.size() - 1 != pos) {
            stack.pop();
        }
        stack.push(url);
        pos++;
    }
    
    public String back(int steps) {
        if (steps > pos) {
            pos = 0;
        } else {
            pos -= steps;
        }
        return stack.get(pos);
    }
    
    public String forward(int steps) {
        if (steps > stack.size() - 1 - pos) {
            pos = stack.size() - 1;
        } else {
            pos += steps;
        }
        return stack.get(pos);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */