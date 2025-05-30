// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insertBack(s,top);
    }
    static void insertBack(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertBack(st,x);
        st.push(top);
    }
}