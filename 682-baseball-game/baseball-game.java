class Solution {
    public int calPoints(String[] operations) {
        int count=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int x=st.peek();
                st.push(x*2);
            }
            else if(s.equals("+")){
                int tp=st.pop();
                int tp2=st.peek();
                int add=tp+tp2;
                st.push(tp);
                st.push(add);
            }
            else{
                st.push(Integer.valueOf(s));
            }
            
            

        }
        if(st.isEmpty()){
            return 0;
        }
        for(int sum:st){
            count+=sum;
        }
        return count;

    }
}