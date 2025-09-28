class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            if(colors[i]!=colors[n-1]){
                res=Math.max(res,n-1-i);
                break;      
            }
        }
        for(int i=n-1;i>=1;i--){
            if(colors[0]!=colors[i]){
                res=Math.max(res,i);
                break;
            }
        }
        return res;
    }
}