class MyStack {
    Queue<Integer>myq;
    public MyStack() {
        myq=new LinkedList<>();

    }
    
    public void push(int x) {
        myq.add(x);
        for(int i=0;i<myq.size()-1;i++){
            int temp=myq.poll();
            myq.add(temp);
        }
    }
    
    public int pop() {
        return myq.poll();
    }
    
    public int top() {
        return myq.peek();
    }
    
    public boolean empty() {
        return myq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */