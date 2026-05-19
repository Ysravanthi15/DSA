class Solution {
    public boolean isbool(int[] piles,int h,int k){
        for(int i=0;i<piles.length;i++){
            int upper=piles[i]/k;
            if(piles[i]%k !=0){
                upper++;
            }
            h-=upper;
            if(h<0){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1000000000;
        while(l<=r){
            int m=l+(r-l)/2;
            if(isbool(piles,h,m)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}