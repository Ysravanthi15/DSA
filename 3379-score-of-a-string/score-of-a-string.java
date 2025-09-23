class Solution {
    public int scoreOfString(String s) {
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length-1;i++){
            int res=Math.abs(ch[i]-ch[i+1]);
            count+=res;
        }
        return count;
    }
}