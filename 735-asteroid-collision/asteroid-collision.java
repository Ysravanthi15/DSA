class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int i : asteroids){
            while(!st.isEmpty()&& i<0 && st.peek()>0){
                int diff=i+st.peek();
                if(diff<0){
                    st.pop();
                }
                else if(diff==0){
                    st.pop();
                    i=0;
                }
                else{
                    i=0;
                }
                
            }
            if(i!=0) st.push(i);
        }
        int ans[]=new int[st.size()];
        for(int j=ans.length-1;j>=0;j--){
            ans[j]=st.pop();
        }
        return ans;
    }
}