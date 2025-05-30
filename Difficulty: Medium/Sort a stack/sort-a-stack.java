/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return s;
        }
        int top = s.pop();
        sort(s);
        insertAtRightPosition(s,top);
        return s;
    }
    static void insertAtRightPosition(Stack<Integer> stack, int x){
        if(stack.isEmpty() || stack.peek() <= x){
            stack.push(x);
            return;
        }
        int top = stack.pop();
        insertAtRightPosition(stack,x);
        stack.push(top);
    }
}