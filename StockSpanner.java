class StockSpanner {

    Stack<Node> stack = new Stack<>();
    
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.pop().span;
        }
        stack.push(new Node(price, span));
        return stack.peek().span;
    }
    
    class Node {
        private int price;
        private int span;
        public Node(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
