class MinStack {
    ArrayDeque<Integer> st;
    ArrayDeque<Integer> min;
    
    public MinStack() {
        st = new ArrayDeque<>();
        min = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.addFirst(val);
        if (min.peek() == null) min.addFirst(val);
        else if (val < min.peek()) min.addFirst(val);
        else min.addFirst(min.peek());
        System.out.println(min.peek() + " and " + val);
    }
    
    public void pop() {

        st.removeFirst();
        min.removeFirst();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

}
