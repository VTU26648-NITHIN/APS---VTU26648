class MinStack {

    private java.util.ArrayDeque<Integer> stack;
    private java.util.ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new java.util.ArrayDeque<>();
        minStack = new java.util.ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}