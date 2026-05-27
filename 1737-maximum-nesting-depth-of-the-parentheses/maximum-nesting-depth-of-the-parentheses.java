class Solution {
    public int maxDepth(String s) {
       Stack<Character> st=new Stack<>();
       int ans=0;
       for(int i=0;i<s.length();i++){
        char val=s.charAt(i);
        if(val=='('){
            st.push(val);

        }
        else if(val==')'){
            st.pop();
        }
        ans=Math.max(ans,st.size());
       } 
       return ans;
    }
}